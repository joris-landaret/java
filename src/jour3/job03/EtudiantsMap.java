package jour3.job03;
import java.util.HashMap;

public class EtudiantsMap {

    public static void main(String[] args) {
        HashMap<Integer, String> etudiants = new HashMap<>();
        etudiants.put(153, "Baptiste");
        etudiants.put(154, "Cédric");
        etudiants.put(155, "David");
        etudiants.put(156, "Elias");

        // Affichez les étudiants
        System.out.println("Etudiants :");
        for (HashMap.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Autre façon d'afficher les étudiants
        System.out.println("Etudiants :");
        etudiants.forEach((key, value) -> System.out.println(key + " : " + value));

        // Autre façon d'afficher les étudiants
        System.out.println("Etudiants :");
        for (Integer key : etudiants.keySet()) {
            System.out.println(key + " : " + etudiants.get(key));
        }
    }
}