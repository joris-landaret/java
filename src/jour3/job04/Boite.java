package jour3.job04;

public class Boite<T> {
    private T boite;
    public Boite() {
        this.boite = null;
    }
    public void ajouter(T objet) {
        this.boite = objet;
    }

    public T recuperer() {
        return this.boite;
    }

    public static void main(java.lang.String[] args) {
        Boite<String> boite = new Boite<>();
        boite.ajouter("Bonjour");
        System.out.println("Contenu de la boite : " + boite.recuperer());
    }
}
