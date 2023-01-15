package Entry;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.println("Write the First Number :");
        n1 = input.nextInt();
        System.out.println("Write the Second Number :");
        n2 = input.nextInt();

        System.out.println("Press 1-Addition\n2-Minus\n3-Times\n4-Divide");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("Addition : "+ (n1+n2));
                break;
            case 2:
                System.out.println("Minus : "+ (n1-n2));
                break;
            case 3:
                System.out.println("Times : "+ (n1*n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Number couldnt diveded by 0 Try Again");
                        break;
                    default:
                        System.out.println("Divide : "+ (n1/n2));
                }
                break;
            default:
                System.out.println("Wrong Number Typed");

        }

        }
    }

