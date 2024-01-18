package arrayssize;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] arr = {5,-8,23,7,-8,4,2,0,400,-400};
        System.out.println("The original array is:");
        for(int num:arr){
            System.out.println(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\n The Sorted array is");
        for(int num :arr){
            System.out.println(num + " ");
        }

    }
}
