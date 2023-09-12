package jour5.job02;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList(args));

        for (String s : set) {
            System.out.println(s);
        }
    }
}
