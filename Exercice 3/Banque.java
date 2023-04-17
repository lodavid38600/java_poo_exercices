import java.util.ArrayList;

public class Banque {
    private String nom;
    private ArrayList<Client> clients;

    public Banque(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
