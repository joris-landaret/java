package jour5.job04;
import java.util.function.Consumer;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        String chain = args[0];
        int comparateur = Integer.parseInt(args[1]);

        Consumer<String> afficher = (String chainChar) -> {
            if (chainChar.length() > comparateur) {
                System.out.println("la chaine " + chainChar + " a une longueur supérieur à " + comparateur);
            } else {
                System.out.println("la chaine " + chainChar + " a une longueur inférieur ou égal à " + comparateur);
            }
        };


        afficher.accept(chain);
    }

}
