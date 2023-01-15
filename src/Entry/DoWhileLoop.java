package Entry;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        int password;
        boolean askPassword = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Write Your Password: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Password is True");
                askPassword = false;
            } else {
                System.out.println("Password is False");
            }
        }while (askPassword);
    }
}
