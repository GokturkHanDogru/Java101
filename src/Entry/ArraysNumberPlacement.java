package Entry;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysNumberPlacement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Write the Array´s Dimension");
        int n = input.nextInt();
        int [] list = new int[n];

        for (int i =1 ; i<=n;i++) {
            System.out.println("Please Write the Array´s " + i + ". Number");
            int number = input.nextInt();
            for (int j = (i - 1); j < n; j++) {
                list[j] = number;
            }
        }
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));


    }
}
