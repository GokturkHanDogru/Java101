package Entry;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int i=1, j=1, k=1;
        int r,n,total;
        int ntotal=1;
        int rtotal=1;
        int diftotal=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a Number that You Want to Find Combination Value: ");
        n = input.nextInt();


        System.out.println("Write a Second Number that You Want to Find Combination Value: ");
        r = input.nextInt();


        while (i<=n) {
            ntotal = ntotal * i;
            i++;

        }
        while (j<=r) {
            rtotal = rtotal * j;
            j++;
        }
        while (k<=(n-r)) {
            diftotal = diftotal * k;
            k++;
        }
            total = ((ntotal) / ((rtotal) * diftotal));
            System.out.println(ntotal);
            System.out.println(rtotal);
            System.out.println(diftotal);

         System.out.println("Combination Value : "+total);
    }
}

