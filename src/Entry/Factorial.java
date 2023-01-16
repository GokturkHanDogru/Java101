package Entry;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int i=1,x;
        int total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a Number that You Want to Find Factorial Value: ");
        x = input.nextInt();

        while (i<=x){
            total = total*i;
              i++;

        }System.out.println("Factorial Value: " + total);

    }
}
