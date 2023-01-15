package Entry;
import java.util.Scanner;
public class NumberComparesion {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Write First Number");
        a = input.nextInt();
        System.out.println("Write Second Number");
        b = input.nextInt();
        System.out.println("Write Third Number");
        c = input.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        } else if ((b>a)&&(b>c)) {
            if (a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }

        }else {
            if (b > a) {
                System.out.println("c>b>a");
            } else {
                System.out.println("c>a>b");
            }
        }
    }
}
