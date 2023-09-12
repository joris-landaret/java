package jour5.job01;
import java.util.ArrayList;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Ajoutez tous les arguments de la ligne de commande à l'ArrayList
        for (String arg : args) {
            list.add(arg);
        }

        System.out.println(list);
    }
}
