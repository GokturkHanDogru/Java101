package Entry;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write Fibonacci Line : ");
        int x = input.nextInt();
        int firstValue = 0;
        int secondValue = 1;

        for (int i = 0; i<=x; i++){
            System.out.print(firstValue+" ");
            int nextNumber = firstValue+secondValue;
            firstValue = secondValue;
            secondValue = nextNumber;

        }
    }
}
