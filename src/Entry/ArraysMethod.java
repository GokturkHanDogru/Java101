package Entry;
import java.util.Arrays;
public class ArraysMethod {
    public static void main(String[] args) {
        int[] list = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(list));
        System.out.println("----------------------------------");

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("----------------------------------");

        System.out.println("Index of 79: "+ Arrays.binarySearch(list,79));
        System.out.println("----------------------------------");

        int [] copyArr =  Arrays.copyOf(list,5);
        System.out.println(Arrays.toString(copyArr));
        System.out.println("----------------------------------");
    }
}
