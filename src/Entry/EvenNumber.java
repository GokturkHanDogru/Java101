package Entry;
import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        int x ;
        int i =1;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a Number");
         x = input.nextInt();

         while (i<=x) {
             i++;
             if (i % 2 == 0) {
                 System.out.println(i);

             }
         }
    }
}
