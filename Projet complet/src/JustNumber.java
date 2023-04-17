/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 12/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */


import java.util.Scanner;
import java.util.Random;

public class JustNumber {
    public static void jouer() {
        // Générer un nombre aléatoire entre 1 et 100
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(100) + 1;

        // Initialiser le Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Compter le nombre de tentatives
        int nombreDeCoups = 0;
        boolean trouve = false;

        System.out.println("Devinez le nombre entre 1 et 100 (inclus) :");

        // Continuer tant que le nombre n'est pas trouvé
        while (!trouve) {
            System.out.print("Entrez un nombre : ");
            int entreeUtilisateur = scanner.nextInt();
            nombreDeCoups++;

            if (entreeUtilisateur == nombreAleatoire) {
                trouve = true;
                System.out.println("Félicitations ! Vous avez trouvé le nombre.");
                System.out.println("Vous avez eu besoin de " + nombreDeCoups + " coups pour gagner.");
            } else if (entreeUtilisateur < nombreAleatoire) {
                System.out.println("Plus grand !");
            } else {
                System.out.println("Plus petit !");
            }
        }

    }

}
