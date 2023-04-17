public class BanqueService {

    public void effectuerVirement(Client emetteur, Client destinataire, double montant) {
        CompteBancaire compteEmetteur = emetteur.getCompte();
        CompteBancaire compteDestinataire = destinataire.getCompte();

        compteEmetteur.debiter(montant);
        compteDestinataire.crediter(montant);
    }
}
