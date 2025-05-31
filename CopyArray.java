package ArrayandString;

public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};

        // Create a new array with the same length
        int[] copiedArray = new int[originalArray.length];

        // Copy elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print the copied array
        System.out.println("Copied array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}

