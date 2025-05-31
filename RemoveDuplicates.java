package ArrayandString;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 40, 20, 50, 30};

        int length = array.length;
        int[] temp = new int[length];
        int newLength = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;

            // Check if the element already exists in temp array
            for (int j = 0; j < newLength; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[newLength] = array[i];
                newLength++;
            }
        }

        // Print the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
