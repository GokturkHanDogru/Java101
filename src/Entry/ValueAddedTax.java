package Entry;
import java.util.Scanner;
public class ValueAddedTax {
    public static void main(String[] args) {
         double value, invoice, vat =0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Write Your Value of Product:");
        value = input.nextDouble();

        invoice = value * (1+vat);
        System.out.println("Value Addded Tax Ratio:" + vat);
        System.out.println("Your Invoice Value: "+ invoice);
    }
}
