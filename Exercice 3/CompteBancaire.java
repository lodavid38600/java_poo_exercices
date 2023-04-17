public class CompteBancaire {
    private String numero;
    private double solde;

    public CompteBancaire(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public void debiter(double montant) {
        solde -= montant;
    }
}
