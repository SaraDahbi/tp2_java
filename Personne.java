
public class Personne {
    private String nom;
    private String prenom;
    private String adresse;

    public Personne(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public static void main() {
        System.out.println("hi mamadou");
    }

    public String getNom() {
        return this.nom;
    }
}
