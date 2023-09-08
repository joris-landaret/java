package jour3.job01;

import java.util.ArrayList;

public class Liste {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            int somme = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    somme += list.get(i);
                }
            }
            System.out.println("Somme des nombres pairs : " + somme);
        }
}
