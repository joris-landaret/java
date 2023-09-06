package jour1.job04;
import java.util.Scanner;

public class CompteBancaire {

    private int solde = 100;

    public void deposer(int nb) {
        this.solde += nb;
    }

    public void retirer(int nb) {
        CompteBancaire compte = new CompteBancaire();
        this.solde -= nb;
    }

    public void afficher() {
        System.out.println("solde actuel : " + this.solde + " euros");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("veuiller choisir le chiffre corespondant a l'action voulu : 1 voir le solde actuel, 2 déposer de l'argent, 3 retirer de l'argent");
        int action = scanner.nextInt();
        CompteBancaire compte = new CompteBancaire();


        if (action == 1) {
            compte.afficher();

        } else if (action == 2) {
            System.out.println("Choisisser la somme à déposer :");
            int depose = scanner.nextInt();

            compte.deposer(depose);

            System.out.println("Vous avez déposer " + depose + " euros votre nouveau solde est de " + compte.solde + " euros");

        } else if (action == 3) {
            System.out.println("Choisisser la somme à retirer :");
            int retire = scanner.nextInt();

            compte.retirer(retire);

            if (compte.solde < 0) {
                compte.solde += retire;

                System.out.println("Tentative de retrait de " + retire + " euros ... Solde induffisant ! votre solde est toujour de " + compte.solde + " uros");

            } else {

                System.out.println("Vous avez déposer " + retire + " euros votre nouveau solde est de " + compte.solde + " euros");
            }
        }
        else {
            System.out.println("Erreur, vous devez choisir entre trois chiffres : 1 = voir le solde actuel, 2 = déposer de l'argent, 3 = retirer de l'argent");
        }

    }
}
