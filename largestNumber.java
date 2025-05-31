package ArrayandString;

public class largestNumber {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 67, 34, 90, 11};

        int largest = numbers[0]; // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update if current element is larger
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}

