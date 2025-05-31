package ArrayandString;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 65, 70};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at index: " + position);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
