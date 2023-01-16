package Entry;
import java.util.Scanner;
public class DigitTotal {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Write a Number : ");
            int number = input.nextInt();
            int tempNumber = number;
            int digitnumber = 0;
            int digitvalue;

            int result = 0;

            while (tempNumber != 0) {
                tempNumber /= 10;
                digitnumber++;
            }
            tempNumber = number;

            while (tempNumber != 0) {
                digitvalue = tempNumber % 10;
                int digitpower = 1;

                /*for (int i = 1; i <= digitnumber; i++) {
                    digitpower *= digitvalue;
                }*/
                result += digitvalue;
                tempNumber /= 10;
            }
            System.out.println(result);

    }
}
