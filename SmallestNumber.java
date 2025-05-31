package ArrayandString;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {25, 17, 31, 13, 2, 88, 45};

        int smallest = numbers[0]; // Assume the first element is the smallest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update if a smaller element is found
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
