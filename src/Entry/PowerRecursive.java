package Entry;
import java.util.Scanner;
public class PowerRecursive {

    static double power (double expo, double base) {

        if (expo == 0) {
            return 1;
        }
        double result = power(expo-1,base) * base;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the Base Number : ");
        double base = input.nextDouble();
        System.out.println("Write the Power of Number : ");
        double expo = input.nextDouble();

        System.out.println(power(expo,base));
    }
}
