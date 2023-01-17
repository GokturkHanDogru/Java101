package Entry;
import java.util.Scanner;
public class AtmExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        String userName, password;
        int balance = 1500;
        int selection;

        while (right>0){
            System.out.println("Username : ");
            userName = input.nextLine();
            System.out.println("Password : ");
            password = input.nextLine();
            if (userName.equals("Path") && password.equals("Java101")){
                System.out.println("Welcome X Bank How Can We Help You :)");
                do {
                    System.out.println("Please Choose a Transction");
                    System.out.println("1-Deposit Money\n"+"2-Withdraw Money\n"+"3-Balance\n"+"4-Exit");
                    selection = input.nextInt();
                    if (selection==1){
                        System.out.println("How Much Money Do You Want to Deposit : ");
                        int money = input.nextInt();
                        balance += money;
                    }else if (selection==2){
                        System.out.println("How Much Money Do You Want to Deposit : ");
                        int money = input.nextInt();
                        if (money>balance){
                            System.out.println("Sorry You Don´t Enough Money");
                        }else{
                            balance -= money;
                        }
                    }else if (selection==3){
                        System.out.println("Your Balance is "+balance);
                    }
                }while (selection !=4);
                System.out.println("See You Later, Thank You for Choosing Us!");
                break;
            }else{
                right--;
                System.out.println("Wrong Username or Password. Please Try Again!");
                if (right==0){
                    System.out.println("Your Account Has Been Bloked. Please Call the Help Desk!");
                }else{
                    System.out.println("You have "+ right + " More Right");
                }
            }
        }

    }
}
