package Entry;
import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        int x,y;
        int total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Write 1st Number : ");
        x = input.nextInt();
        System.out.println("Please Write 2nd Number : ");
        y = input.nextInt();

        for (int i=1; i<=y;i++){
            total *= x;
        }
        System.out.println("Total: "+ total);

    }
}
