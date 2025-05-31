package String;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Get the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare strings using equals()
        if (str1.equals(str2)) {
            System.out.println("The strings are exactly equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Optional: Case-insensitive comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal (ignoring case).");
        }
    }
}
