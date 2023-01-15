package Entry;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Write a Radius Value :");
        r = input.nextInt();

        Double square = pi*r*r;
        System.out.println("Square : "+square);
        double perimeter = 2*pi*r;
        System.out.println("Perimeter : "+perimeter);
    }
}
