public class ArrayReverser {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] numbers = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};
        
        System.out.println("Original Array:");
        for (float num : numbers) {
            System.out.print(num + " ");
        }

        // Reverse the array
        reverse(numbers);

        System.out.println("\nReversed Array:");
        for (float num : numbers) {
            System.out.print(num + " ");
        }
    }
}
