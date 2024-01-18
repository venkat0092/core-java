package arrayssize;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, -5, 1, 8, 0};

        int max = numbers[0], min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}








