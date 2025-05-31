package String;

import java.util.Scanner;

    public class CountVowelsConsonants {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int vowels = 0, consonants = 0;

            // Convert the string to lowercase to make comparison easier
            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }
    }

