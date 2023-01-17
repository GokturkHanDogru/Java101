package Entry;
import java.util.Scanner;
public class EbobEkokForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Write First Number : ");
        n1 = input.nextInt();
        System.out.println("Write Second Number : ");
        n2 = input.nextInt();
        int ebob = 1;
        int ekok=1;

        if(n1<n2){
            for (int i = n1;i>=1;i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                    System.out.println("EBOB Value : " + ebob);
                    break;
                }
            }
        }else {
            for (int i = n2; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                    System.out.println("EBOB Value : " + ebob);
                    break;
                }
            }
        }
            for (int k =1;k<=(n1*n2);k++){
                if(k%n1==0 && k%n2==0){
                ekok = k;
                System.out.println("EKOK Value : "+ekok);
                    break;
                }
            }

    }
}
