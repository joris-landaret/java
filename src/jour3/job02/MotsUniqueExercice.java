package jour3.job02;

import java.util.ArrayList;
import java.util.HashMap;

public class MotsUniqueExercice {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("chat");
        list.add("chien");
        list.add("chien");
        list.add("poisson");
        list.add("oiseau");
        list.add("poisson");

        HashMap<String, Integer> unique = new HashMap<>();

        for (String mot : list) {
            unique.put(mot, unique.getOrDefault(mot, 0) + 1);
        }

        // Affichez les mots qui apparaissent une seule fois
        System.out.println("Mots uniques :");
        for (HashMap.Entry<String, Integer> entry : unique.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
