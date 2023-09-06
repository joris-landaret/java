package jour1.job02;

public class Voiture {

    String marque;
    String couleur;
    int vitesse;

    static void demmarer() {
        System.out.println("La voiture démmare.");
    }

    static void accelerer() {
        Voiture voiture = new Voiture();
        voiture.vitesse = 10;

        System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

        voiture.vitesse = 20;

        System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

    }

    static void arret() {
        System.out.println("La voiture s'arrêtte. Vitesse réinitialisée à 0 km/h.");

    }

    public static void main(String[] args) {
        demmarer();
        accelerer();
        arret();
    }
}
