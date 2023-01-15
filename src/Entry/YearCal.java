package Entry;
import java.util.Scanner;
public class YearCal {

        public static void main(String[] args) {

            int year;
            boolean isLeapYear;
            String message;

            Scanner input = new Scanner(System.in);
            System.out.print("Write a Year: ");
            year = input.nextInt();
            input.close();

            if (year < 0) {
                System.out.println("Year Shold be greater then 0");
            } else {
                if (year % 100 == 0) {
                    isLeapYear = (year % 400) == 0 ? true : false;
                } else {
                    isLeapYear = (year % 4) == 0 ? true : false;
                }

                message = isLeapYear ? " is a Leap Year" : " is not a Leap Year!";
                System.out.println(year + message);
            }

        }
    }