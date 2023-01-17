package Entry;
import java.util.Scanner;
public class FindingMinMaxValue {
    public static void main(String[] args) {
        int x;
        int max=0, min=0;
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Number Do You Want to Write : ");
        x = input.nextInt();

        for (int i = 1;i<=x;i++){
            System.out.print(i+". Number : ");
            int y = input.nextInt();
            max = max>y ? max : y;
            min = min<y ? min : y;

        }

        System.out.println(max);
        System.out.println(x < 0 ? "" : "En küçük sayı: " + min);
    }
}
