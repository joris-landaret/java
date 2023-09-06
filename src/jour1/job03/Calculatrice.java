package jour1.job03;
import java.util.Scanner;

public class Calculatrice {

    static void additionner(int nb1, int nb2) {

        int somme = nb1 + nb2;

        System.out.println("Somme : " + somme);
    }

    static void soustraire(int nb1, int nb2) {
        int diference = nb1 - nb2;

        System.out.println("Différence : " + diference);
    }

    static void multiplier(int nb1, int nb2) {
        int produit = nb1 * nb2;

        System.out.println("Produit : " + produit);
    }

    static void diviser(int nb1, int nb2) {
        int division = nb1 / nb2;

        System.out.println("Division : " + division);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : ");
        int numb1 = scanner.nextInt();

        System.out.print("Entrer le deuxième nombre : ");
        int numb2 = scanner.nextInt();

        additionner(numb1, numb2);
        soustraire(numb1, numb2);
        multiplier(numb1, numb2);
        diviser(numb1, numb2);
    }
}
