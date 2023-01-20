package Entry;
import java.util.Scanner;
public class PatternRecursive {

    static void negative (int newNumber) {

        System.out.println(newNumber);
        if(newNumber<=0)
            return ;
        negative(newNumber - 5);
            System.out.println(newNumber);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Number : ");
        int newNumber = input.nextInt();
        negative(newNumber);



    }
}
