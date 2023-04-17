/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 12/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */

public class PyramidString {
    // Méthode pour afficher une pyramide à l'aide de chaînes de caractères
    public static void afficher(int hauteur) {
        // Boucle pour chaque niveau de la pyramide
        for (int i = 1; i <= hauteur; i++) {
            // Boucle pour les espaces avant les étoiles sur chaque niveau
            for (int j = 1; j <= hauteur - i; j++) {
                // Afficher un espace
                System.out.print(" ");
            }
            // Boucle pour les étoiles sur chaque niveau
            for (int k = 1; k <= 2 * i - 1; k++) {
                // Afficher une étoile
                System.out.print("*");
            }
            // Passer à la ligne suivante pour le prochain niveau de la pyramide
            System.out.println();
        }
    }
}
