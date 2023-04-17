public class Client {
    private String nom;
    private String prenom;
    private CompteBancaire compte;

    public Client(String nom, String prenom, CompteBancaire compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public CompteBancaire getCompte() {
        return compte;
    }
}
