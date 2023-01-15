package Entry;
import java.util.Scanner;
public class ExponentialNumberTwo {
    public static void main(String[] args) {
        int x;
        boolean run = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a Number to Find Expo Force of 2:");
        x = input.nextInt();

        for (int i = 1; i<x;i*=2){
            System.out.println(i);
        }


    }
}
