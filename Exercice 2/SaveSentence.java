/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 13/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class SaveSentence {
    // Méthode pour sauvegarder une phrase dans un fichier
    public static void sauvegarder(String phrase, String fichier) throws IOException {
        // Écrire la phrase dans le fichier spécifié
        Files.writeString(Paths.get(fichier), phrase);
    }

    // Méthode pour exécuter la fonctionnalité de sauvegarde de phrase dans un fichier
    public static void executer() {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer une phrase
        System.out.print("Entrez une phrase : ");

        // Lire la phrase entrée par l'utilisateur
        String phrase = scanner.nextLine();

        // Demander à l'utilisateur d'entrer le nom du fichier à sauvegarder
        System.out.print("Entrez le nom du fichier à sauvegarder : ");

        // Lire le nom du fichier entré par l'utilisateur
        String fichier = scanner.nextLine();

        try {
            // Appeler la méthode sauvegarder pour sauvegarder la phrase dans le fichier
            sauvegarder(phrase, fichier);

            // Informer l'utilisateur que la phrase a été sauvegardée avec succès
            System.out.println("La phrase a été sauvegardée dans le fichier : " + fichier);
        } catch (IOException e) {
            // Si une exception se produit lors de la sauvegarde du fichier, afficher un message d'erreur
            System.out.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
        }
    }

}
