package Entry;
import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double total, way, kmprice=2.2, entryprice =10.0;
        Scanner input = new Scanner(System.in);

        System.out.println("How Many Kilometers Did You Ride? :");
        way = input.nextDouble();
        total = (entryprice+(way*kmprice));

        boolean fee = total >=20 ;
        String  vfee = fee ? "Your Taxi Fee :" + total : "Your Taxi Fee :20";
        System.out.println(vfee);
    }
}
