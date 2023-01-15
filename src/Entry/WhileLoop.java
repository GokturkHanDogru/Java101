package Entry;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess){
            System.out.println("Write Your Password: ");
            password = input.nextInt();

            if (password == 123){
                System.out.println("True");
                isPasswordSuccess = true;
            }else{
                System.out.println("False");
            }

        }
    }
}
