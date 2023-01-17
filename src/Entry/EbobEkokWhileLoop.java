package Entry;

import java.util.Scanner;

public class EbobEkokWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Write First Number : ");
        n1 = input.nextInt();
        System.out.println("Write Second Number : ");
        n2 = input.nextInt();
        int smallNumber;
        int i=1;

        if (n1<n2){
            smallNumber=n1;
        }else {
            smallNumber=n2;
        }
        while(smallNumber>=1){
            if (n1%smallNumber==0 && n2%smallNumber==0){
                System.out.println("EBOB Value : "+smallNumber);
                break;
            }
            smallNumber--;
        }
        while (i<(n1*n2)){
            if (i%n1==0 && i%n2==0) {
                System.out.println("EKOK Value : " + i);
                break;
            }
            i++;
        }
    }
}
