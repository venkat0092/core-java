package arrayssize;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array, positions);

        System.out.println("\nArray after left rotation:");
        printArray(array);
    }

    public static void rotateLeft(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n;

        for (int i = 0; i < positions; i++) {
            int temp = arr[0];

            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];

            arr[n - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }
}

