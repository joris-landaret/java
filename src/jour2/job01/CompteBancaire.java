package jour2.job01;
import java.util.Scanner;

public class CompteBancaire {

    private int compteCourant = 100;
    private float compteEpargne = 200F;

    public void interet() {

        System.out.println("Solde du compte épargne : " + this.compteEpargne + " euros avec un taux d'intérêt de 2%");

        float tauxInteret = 0.02F;
        float addinteret = this.compteEpargne * tauxInteret;
        this.compteEpargne += addinteret;

        System.out.println("Intérêts ajoutés: " + addinteret + " euros. Nouveau Solde: " + this.compteEpargne  + " euros");

    }

    public void deposer(int nb) {
        this.compteCourant += nb;
    }

    public void retirer(int nb) {
        this.compteCourant -= nb;
    }

    public void afficher() {
        System.out.println("solde actuel : " + this.compteCourant + " euros");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("veuiller choisir le chiffre corespondant a l'action voulu : 1 voir le solde actuel, 2 déposer de l'argent, 3 retirer de l'argent, 4 afficher le compte épargne avec les intérêts");
        int action = scanner.nextInt();
        CompteBancaire compte = new CompteBancaire();


        if (action == 1) {
            compte.afficher();

        } else if (action == 2) {
            System.out.println("Choisisser la somme à déposer :");
            int depose = scanner.nextInt();

            compte.deposer(depose);

            System.out.println("Vous avez déposer " + depose + " euros votre nouveau solde est de " + compte.compteCourant + " euros");

        } else if (action == 3) {
            System.out.println("Choisisser la somme à retirer :");
            int retire = scanner.nextInt();

            compte.retirer(retire);

            if (compte.compteCourant < 0) {
                compte.compteCourant += retire;

                System.out.println("Tentative de retrait de " + retire + " euros ... Solde induffisant ! votre solde est toujour de " + compte.compteCourant + " euros");

            } else {

                System.out.println("Vous avez déposer " + retire + " euros votre nouveau solde est de " + compte.compteCourant + " euros");
            }
        } else if (action == 4) {
            compte.interet();

        } else {
            System.out.println("Erreur, vous devez choisir entre trois chiffres : 1 = voir le solde actuel, 2 = déposer de l'argent, 3 = retirer de l'argent, 4 = afficher le compte épargne avec les intérêts");
        }

    }
}
