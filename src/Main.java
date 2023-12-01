import entities.Audio;
import entities.ContenutoMultimediale;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi i tuoi dati e clicca play");
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println("Hai inserito: " + name + " "+ surname);
        scanner.close();
        System.out.println("Stai riproducendo:");

        ContenutoMultimediale song = new Audio(13, 30);
        System.out.println(song);
    }
}