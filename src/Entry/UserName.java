package Entry;
import java.util.Scanner;
public class UserName {
    public static void main(String[] args) {
        String  userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Write Your Username:");
        userName = input.nextLine();
        System.out.println("Please Write Your Password");
        password = input.nextLine();

        if (userName.equals("JavaPath") && password.equals("123abc")) {
            System.out.println("Informations are Correct !");
        }else {
            System.out.println("Inforamations are Wrong, Try Again");
        }
    }
}
