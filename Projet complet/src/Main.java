/*
 * ======================================|
 * Auteur : DAVID Louis                  |
 * Date de dernière modification :       |
 * 13/04/2023                            |
 * IPI - CDEV                            |
 *=======================================|
 */
public class Main {
    public static void main(String[] args) {
        // =============================================12/04/2023===================================================
        // Renverser une chaîne de caractères
        String chaine = "Bonjour";
        String chaineRenversee = ReverseString.renverser(chaine);
        System.out.println("Chaîne renversée: " + chaineRenversee);
        // Output: ruojnoB

        // Afficher une pyramide à l’aide de chaînes caractères
        int hauteur = 5;
        System.out.println("Pyramide :");
        PyramidString.afficher(hauteur);
        // Output :
        //     *
        //    ***
        //   *****
        //  *******
        // *********


        // Calculer la somme des nombres jusqu’à 10 000
        int limite = 10000;
        int somme = SumToTenThousand.calculer(limite);
        System.out.println("La somme des nombres jusqu'à 10 000 est : " + somme);
        // Output : 50005000

        // Vérifier si un nombre entré est pair, impair, premier en utilisant la classe Scanner sur System.in et en parsant l'entrée utilisateur
        System.out.println("Vérifier si un nombre est pair, impair, premier :");
        IsEven.verifier();

        //Jeux du nombre :
        JustNumber.jouer();


        // =============================================13/04/2023===================================================
        // Compter le nombre de mots dans une phrase :
        System.out.println("Compter le nombre de mots dans une phrase :");
        CountWord.executer();

        // Sauvegarder une phrase dans un fichier
        System.out.println("\nSauvegarder votre phrase dans un fichier :");
        SaveSentence.executer();

        // Lire un fichier pour compter le nombre de mots a l'intérieur.
        System.out.println("\nLire du texte dans un fichier et compter le nombre de mots contenu :");
        ReadFileAndCountWords.executer();

        // =============================================18/04/2023===================================================
        // Créer et afficher un rectangle
        Rectangle rect = new Rectangle(3, 5);
        rect.display();
        System.out.println("Largeur: " + rect.getWidth() + ", Hauteur: " + rect.getHeight());

        // Créer et afficher un carré
        Square square = new Square(4);
        square.display();
        System.out.println("Côté: " + square.getSideLength() + ", Surface: " + square.calculateArea());

        // Créer et afficher les détails d'une voiture
        Voiture voiture = new Voiture("Renault", "Clio", 2020);
        voiture.afficherDetails();

        // Créer et afficher les détails d'un utilisateur
        Utilisateur utilisateur = new Utilisateur("Dupont", "Jean", 30);
        utilisateur.afficherDetails();

        // Créer des comptes bancaires
        CompteBancaire compte1 = new CompteBancaire("00001", 1000.0);
        CompteBancaire compte2 = new CompteBancaire("00002", 2000.0);

        // Créer des clients
        Client client1 = new Client("Dupont", "Jean", compte1);
        Client client2 = new Client("Martin", "Marie", compte2);

        // Créer une banque et ajouter des clients
        Banque banque = new Banque("MaBanque");
        banque.ajouterClient(client1);
        banque.ajouterClient(client2);

        // Utiliser le service bancaire pour effectuer un virement
        BanqueService banqueService = new BanqueService();
        banqueService.effectuerVirement(client1, client2, 500.0);

        // Afficher les soldes des comptes après le virement
        System.out.println("Solde du compte de " + client1.getNom() + " " + client1.getPrenom() + ": " + client1.getCompte().getSolde());
        System.out.println("Solde du compte de " + client2.getNom() + " " + client2.getPrenom() + ": " + client2.getCompte().getSolde());
    }
}