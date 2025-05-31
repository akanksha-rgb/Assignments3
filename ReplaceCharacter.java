package String;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input original string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input character to be replaced
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        // Input replacement character
        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        // Replace characters using replace() method
        String replacedString = input.replace(oldChar, newChar);

        System.out.println("String after replacement: " + replacedString);
    }
}
