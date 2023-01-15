package Entry;
import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        int x;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Write a Number");
            x = input.nextInt();
            if(x%2==1){
                total +=x;
            }

        }while (x>0);
        System.out.println("Total :"+total);
    }
}
