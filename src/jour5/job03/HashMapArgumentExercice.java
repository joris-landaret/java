package jour5.job03;
import java.util.HashMap;
public class HashMapArgumentExercice {
    public static void main(String[] args) {
        // Ajoutez tous les arguments de la ligne de commande à l'HashMap
         HashMap<String, String> map = new HashMap<>();
         for (int i = 0; i < args.length; i+=2) {

             map.put(args[i], args[i+1]);
         }

         for (String key : map.keySet()) {
             System.out.println(key + " : " + map.get(key));
         }
    }
}
