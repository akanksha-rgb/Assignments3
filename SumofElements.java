package ArrayandString;

public class SumofElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each element to the sum
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

