package jour2.job05;

public class Voiture {

    String marque;
    String couleur;
    int vitesse;

    static void demmarer() {
        System.out.println("La voiture démmare.");
    }

    static void accelerer() {


        try {
            Voiture voiture = new Voiture();

            voiture.vitesse = 10;
            System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

            voiture.vitesse = 20;
            System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

            voiture.vitesse = 111;
            System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

            voiture.vitesse = 121;
            System.out.println("La vitesse est maintenant de " + voiture.vitesse + " km/h.");

            if (voiture.vitesse > 100) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Erreur : VitesseLimiteDepasseeException.");
        }
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
