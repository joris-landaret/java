package jour2.job02;

public class Main {
    public static void main(String[] args) {
        Nageur nageur1 = new Homme();
        Nageur nageur2 = new Poisson();

        nageur1.nager(); // Affiche "L'homme nage."
        nageur2.nager(); // Affiche "Le poisson nage rapidement."
    }
}
