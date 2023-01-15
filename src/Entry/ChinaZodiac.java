package Entry;
import java.util.Scanner;

public class ChinaZodiac {
    public static void main(String[] args) {
        String zodiac = "";
        int mode, year;
        Scanner input = new Scanner(System.in);
        System.out.println("Write Your Birth Year? ");
        year = input.nextInt();
        mode = (year %= 12);

        if (mode == 0) {
            zodiac = "Monkey";
        } else if (mode == 1) {
            zodiac = "Rooster";
        } else if (mode == 2) {
            zodiac = "Dog";
        }


        System.out.println("Your China Zodiac Sign :"+zodiac);
    }
}