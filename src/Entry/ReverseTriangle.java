package Entry;
import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Line Number : ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("");
            for (int j = 1; j <= (i * 1) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*(x-i)-1); k++){
                System.out.print("*");
            }

        }
    }
}
