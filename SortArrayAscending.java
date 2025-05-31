package ArrayandString;

public class SortArrayAscending {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 5, 66, 21, 89, 1};

        // Bubble sort algorithm
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
