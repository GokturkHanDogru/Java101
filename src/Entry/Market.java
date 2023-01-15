package Entry;
import java.util.Scanner;
public class Market {
    public static void main(String[] args) {
        double total, pear=2.14, apple=3.67, tom=1.11, ban=0.95, eggp=5;
        double pearkg, applekg, tomkg, bankg,eggpkg;
        Scanner input = new Scanner(System.in);

        System.out.println("How Many Kilos Pears : ");
        pearkg = input.nextDouble();

        System.out.println("How Many Kilos Apples : ");
        applekg = input.nextDouble();

        System.out.println("How Many Kilos Tomatoes : ");
        tomkg = input.nextDouble();

        System.out.println("How Many Kilos Bananas : ");
        bankg = input.nextDouble();

        System.out.println("How Many Kilos Eggplants : ");
        eggpkg = input.nextDouble();

        total = (pearkg*pear)+(applekg*apple)+(tomkg*tom)+(bankg*ban)+(eggpkg*eggp);
        System.out.println("Your Total Invoice Value : "+total);
    }
}
