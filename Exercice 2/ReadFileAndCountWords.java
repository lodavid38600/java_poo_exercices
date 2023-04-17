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

public class ReadFileAndCountWords {
    // Méthode pour lire le contenu d'un fichier à partir d'un chemin donné
    public static String lireFichier(String cheminFichier) throws IOException {
        // Lire et retourner le contenu du fichier en tant que chaîne de caractères
        return Files.readString(Paths.get(cheminFichier));
    }

    // Méthode pour exécuter la fonctionnalité de lecture de fichier et de comptage de mots
    public static void executer() {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le chemin du fichier
        System.out.print("Entrez le chemin du fichier : ");

        // Lire le chemin du fichier entré par l'utilisateur
        String cheminFichier = scanner.nextLine();

        try {
            // Lire le contenu du fichier
            String contenuFichier = lireFichier(cheminFichier);

            // Compter le nombre de mots dans le contenu du fichier
            int nombreDeMots = CountWord.compter(contenuFichier);

            // Afficher le nombre de mots dans le fichier
            System.out.println("Le nombre de mots dans le fichier est : " + nombreDeMots);
        } catch (IOException e) {
            // Si une exception se produit lors de la lecture du fichier, afficher un message d'erreur
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
