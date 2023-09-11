package jour3.job06;

import java.util.ArrayList;
import java.util.List;

public class StreamChaines {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("cat");
         list.add("attention");
         list.add("chien");
         list.add("att");
         list.add("oiseau");
         list.add("add");
         list.add("poisson");

         List<String> resultat = list.stream()
                 .filter(mot -> mot.length() < 4) // Filtre les mots de moins de 4 caractères
                 .filter(mot -> mot.charAt(0) == 'a')   // Filtre les mots commençant par 'a'
                 .toList();

         System.out.println("Mots filtrés : " + resultat);

    }
}
