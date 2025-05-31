package String;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase using built-in method
        String upperCase = input.toUpperCase();

        System.out.println("String in uppercase: " + upperCase);
    }
}
