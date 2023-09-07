package jour1.job06;
import java.util.ArrayList;

public class Etudiant {

    ArrayList<Integer> note = new ArrayList<Integer>();
    String nom = "Jo";

    public void addNote(int nb) {
        this.note.add(nb);
    }

    public void getlowNote() {
        int plusPetit = this.note.get(0);

        for (int i = 0; i < this.note.size(); i++) {
            if (this.note.get(i) < plusPetit) {
                plusPetit = this.note.get(i);
            }
        }

        System.out.println("Note la plus basse: " + plusPetit);
    }

    public void getHighNote() {
        int plusGrand = this.note.get(0);

        for (int i = 0; i < this.note.size(); i++) {
            if (this.note.get(i) > plusGrand)
                plusGrand = this.note.get(i);

        }

        System.out.println("Note la plus haute: " + plusGrand);

    }

    public void moyenne() {
        float somme = 0;

        for (int i = 0; i < this.note.size(); i++) {
            somme += this.note.get(i);
        }

        float moyenne = somme / this.note.size();

        System.out.println("Moyenne: " + moyenne);
    }

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        etudiant.addNote(15);
        etudiant.addNote(3);
        etudiant.addNote(11);

        System.out.println("Nom de l'étudiant:" + etudiant.nom);
        etudiant.getHighNote();
        etudiant.getlowNote();
        etudiant.moyenne();
    }
}
