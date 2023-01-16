package Entry;
import java.util.Scanner;
public class StarTriangleForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Number : ");
        int x = input.nextInt();

        for (int i = 1; i<=x; i++){
            for (int k = 1; k<=(x-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        } //for Diamond
        for (int l = 1; l<=(x-1); l++){
            for (int m = 0; m<=(1*l)-1;m++ ){
                System.out.print(" ");
            }
            for (int n = 1; n<= (2*(x-l)-1); n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
