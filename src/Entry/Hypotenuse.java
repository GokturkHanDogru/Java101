package Entry;
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        int x,y;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Write 1st Side Value :");
        x = input.nextInt();
        System.out.println("Please Write 2nd Side Value :");
        y = input.nextInt();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse Value : "+z);
    }
}
