

package Entry;
import java.util.Scanner ;
public class UserDataEntry {
    public static void main(String[] args) {

        int x; String y;
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number: ");
        x = input.nextInt();
        System.out.println(x);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please write a text: ");
        y = input2.nextLine();
        System.out.println(y);

    }
}
