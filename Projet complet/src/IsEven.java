/*
 * ========================|
 * Auteur : DAVID Louis    |
 * Date de production :    |
 * 12/04/2023              |
 * IPI - CDEV              |
 *=========================|
 */

import java.util.Scanner;

public class IsEven {

    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour vérifier si un nombre est pair ou impair
    public static void verifier() {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre : ");

        // Lire l'entrée de l'utilisateur
        String input = scanner.nextLine();
        int nombre;

        // Essayer de convertir l'entrée de l'utilisateur en nombre entier
        try {
            nombre = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Si la conversion échoue, afficher un message d'erreur et quitter la méthode
            System.out.println("Ce n'est pas un nombre valide.");
            scanner.close();
            return;
        }

        // Vérifier si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            // Si le reste de la division du nombre par 2 est égal à 0, le nombre est pair
            System.out.println("Le nombre est pair.");
        } else {
            // Sinon, le nombre est impair
            System.out.println("Le nombre est impair.");
        }

        if (estPremier(nombre)) {
            System.out.println("Le nombre est premier.");
        } else {
            System.out.println("Le nombre n'est pas premier.");
        }

    }
}
