package jour4.job03;

public class SynchronizationExercice {

    public static void main(String[] args) throws InterruptedException {
        // Solde initial de la banque (fourni en tant qu'argument)

        // Créez un objet de compte bancaire partagé avec le solde initial
        CompteBancaire compteBancaire = new CompteBancaire(200.0);

        // Créez deux threads pour les retraits
        Thread thread1 = new Thread(new RetraitThread(compteBancaire, 50.0));
        Thread thread2 = new Thread(new RetraitThread(compteBancaire, 70.0));

        // Démarrez les threads
        thread1.start();
        thread2.start();

        thread2.join();

        System.out.println("Solde restant : " + compteBancaire.solde);
    }
}

// Classe représentant un compte bancaire
class CompteBancaire {
    double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode synchronisée pour effectuer un retrait
    public synchronized void retirer(double montant) {
        if (solde >= montant) {
            System.out.println("Retrait de " + montant + " effectué avec succès.");
            solde -= montant;
        } else {
            System.out.println("Fonds insuffisants pour le retrait de " + montant);
        }

    }
}

// Classe représentant un thread de retrait
class RetraitThread implements Runnable {
    private CompteBancaire compteBancaire;
    private double montant;

    public RetraitThread(CompteBancaire compteBancaire, double montant) {
        this.compteBancaire = compteBancaire;
        this.montant = montant;
    }

    @Override
    public void run() {
        compteBancaire.retirer(montant);
    }

}
