package jour1.job05;
import java.util.Random;
public class JeuDeDes {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt(1,7);
        int dice2 = random.nextInt(1,7);
        int somme = dice1 + dice2;

        System.out.println("Dés 1 :" + dice1);
        System.out.println("Dés 2 :" + dice2);
        System.out.println("Somme :" + somme);

    }
}
