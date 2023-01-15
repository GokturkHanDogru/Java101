package Entry;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        int kg;
        double bmi,meter;
        Scanner input = new Scanner(System.in);

        System.out.println("How Tall Are You (meter) : ");
        meter = input.nextDouble();
        System.out.println("What Is Your Weight? (kg) : ");
        kg = input.nextInt();

        bmi = kg/(meter*meter);
        System.out.println(" Your BMI Value is : " + bmi);
    }
}
