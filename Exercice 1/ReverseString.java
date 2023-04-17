/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 12/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */

public class ReverseString {
    // Méthode pour renverser une chaîne de caractères
    public static String renverser(String chaine) {
        // Créer un nouvel objet StringBuilder avec la chaîne de caractères en entrée
        // Inverser l'ordre des caractères dans le StringBuilder
        // Retourner le résultat en tant que chaîne de caractères
        return new StringBuilder(chaine).reverse().toString();
    }
}
