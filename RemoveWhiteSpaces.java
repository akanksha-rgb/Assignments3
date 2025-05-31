package String;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace all whitespace characters with an empty string
        String noSpaces = input.replaceAll("\\s+", "");

        System.out.println("String without white spaces: " + noSpaces);
    }
}
