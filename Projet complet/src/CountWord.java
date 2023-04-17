/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 13/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */

import java.util.Scanner;

public class CountWord {
    // Méthode pour compter le nombre de mots dans une phrase
    public static int compter(String phrase) {
        // Supprimer les espaces en début et en fin de phrase, puis diviser la phrase en mots en utilisant les espaces comme séparateurs
        String[] mots = phrase.trim().split("\\s+");

        // Retourner le nombre de mots dans la phrase
        return mots.length;
    }

    // Méthode pour exécuter la fonctionnalité de comptage de mots
    public static void executer() {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer une phrase
        System.out.print("Entrez une phrase : ");

        // Lire la phrase entrée par l'utilisateur
        String phrase = scanner.nextLine();

        // Compter le nombre de mots dans la phrase
        int nombreDeMots = compter(phrase);

        // Afficher le nombre de mots dans la phrase
        System.out.println("Le nombre de mots dans la phrase est : " + nombreDeMots);
    }
}
