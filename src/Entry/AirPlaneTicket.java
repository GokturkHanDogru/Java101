package Entry;
import java.util.Scanner;
public class AirPlaneTicket {
    public static void main(String[] args) {
        int km,trip;
        double tripdsc,disctotal, agedsc,normaltotal, age, kmprice = 0.1;
        Scanner input = new Scanner(System.in);

        System.out.println("Write Your Age :");
        age = input.nextInt();
        System.out.println("How Many Km Do You Want to Fly?");
        km = input.nextInt();
        System.out.println("Press 1 for an One Way Trip or Press 2 for a Round Trip");
        trip = input.nextInt();

        agedsc = ((age <12) ? 0.5 : (age>=12 && age<24) ? 0.1 : (age>65) ?  0.3 : 0);
        tripdsc = (trip ==1) ? 0 : 0.2;

        if ((km>0 && age>0) && (trip == 1 || trip == 2)) {
            normaltotal = km * kmprice;
            disctotal = normaltotal - (normaltotal * agedsc);
            normaltotal = disctotal - (disctotal * tripdsc);
            normaltotal = (trip == 1) ? normaltotal : normaltotal*2;
            System.out.println("Total : " + normaltotal);
        } else{
            System.out.println("You Write Something Wrong");


        }






      /*  if ((trip != 1 && trip != 2) || (km<0 || age<0)) {
            System.out.println("You Wrote Something Wrong!");
        }

        total = km * kmprice;

        if (age < 12) {
            dsc = total * 0.5;
            total -= dsc;
            System.out.println(total);
        } else if (age >= 12 && age < 24) {
            dsc = total * 0.1;
            total -= dsc;
            System.out.println(total);
        } else if (age > 64) {
            dsc = total * 0.3;
            total -= dsc;
            System.out.println(total);
        }else {
        System.out.println(total);
        } */

    }
}

