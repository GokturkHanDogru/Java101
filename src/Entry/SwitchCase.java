package Entry;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        int day;
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Wrong Number Typed!");
        }
    }
}
