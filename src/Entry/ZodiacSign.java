package Entry;
import java.util.Scanner;
public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        String zodiac = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Write your Month :");
        month = input.nextInt();

        System.out.println("Write your Day :");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiac = "Capricorn";
                    } else {
                        zodiac = "Aquaris";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if(day>=1 && day<=29){
                    if (day<22) {
                        zodiac ="Aquaris";
                    }else {
                        zodiac ="Pisces";
                    }
                }else{
                    isError = true;
                }
                break;
            case 3:
                if(day>=1 && day<=31){
                    if(day<22){
                        zodiac ="Pisces";
                    }else{
                        zodiac ="Aries";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("You Wrote Something Wrong, Try Again");
        }else{
            System.out.println("Your Sign is "+zodiac);
        }
    }
}

