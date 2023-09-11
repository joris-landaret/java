package jour3.job05;
import java.util.ArrayList;
import java.util.List;
public class StreamOperation {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);

        List<Integer> resultat = numbers.stream()
                .map(nombre -> nombre * 2) // Double chaque nombre
                .filter(nombre -> nombre > 10) // Filtre les nombres supérieurs à 10
                .toList(); // Collecte les résultats dans une liste

        System.out.println("Résultat : " + resultat);
    }
}
