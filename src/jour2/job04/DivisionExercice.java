package jour2.job04;
import java.util.Scanner;
public class DivisionExercice {

    public void division(int nb1, int nb2){
        try {
            int result = nb1 / nb2;
            System.out.println("Le résultat de la division est : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : DivisionParZeroException.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisionExercice div = new DivisionExercice();
        System.out.println("Entrez un premier nombre :");
        int nb1 = sc.nextInt();
        System.out.println("Entrez un deuxième nombre :");
        int nb2 = sc.nextInt();
        div.division(nb1, nb2);
    }
}
