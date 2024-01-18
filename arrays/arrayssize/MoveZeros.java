package arrayssize;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 4, 0, 1, 3};

        System.out.println("Original Array:");
        printArray(numbers);

        moveZerosToEnd(numbers);

        System.out.println("\nArray after moving zeros to the end:");
        printArray(numbers);
    }

    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        for (int num : nums) {
            if (num != 0) nums[nonZeroIndex++] = num;
        }

        while (nonZeroIndex < nums.length) nums[nonZeroIndex++] = 0;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }
}

