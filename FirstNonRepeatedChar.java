package String;

import java.util.Scanner;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase (optional)

        int[] freq = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] == 1) {
                System.out.println("First non-repeated character: " + input.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
