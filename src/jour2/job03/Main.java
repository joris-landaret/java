package jour2.job03;

import jour2.job02.Homme;
import jour2.job02.Nageur;
import jour2.job02.Poisson;

public class Main {
    public static void main(String[] args) {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal oiseau = new Oiseau();

        chat.faireDuBruit();
        chien.faireDuBruit();
        oiseau.faireDuBruit();

    }
}
