package Entry;
import java.util.Scanner;
public class StarTriangleWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Write a Number : ");
        x = input.nextInt();

        int i=0;
        while (i<=x){
            int j=0;
            while (j<(x-i)){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while (k<=(2*i)-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
