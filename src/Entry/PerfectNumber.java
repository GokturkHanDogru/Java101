package Entry;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a Number to Find is It Perfect or Not : ");
        int x = input.nextInt();
        int total=0;

        for (int i =1; i<=x; i++){
            if(x%i == 0){
                total+=i;
            }

        }
        System.out.println(total);
        if (total==(2*x)){
            System.out.println(x+" is a Perfect Number!");
        }else {
            System.out.println(x+" ia not a Perfect Number!");
        }

    }
}
