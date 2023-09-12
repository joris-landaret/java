package jour5.job01;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {

        // Ajoutez tous les arguments de la ligne de commande à l'ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(args));

        System.out.println(list);
    }
}
