package Entry;
import java.util.Scanner;
public class PracticeAverageGrade {
    public static void main(String[] args) {
        int math, lit, chem, his, mus;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Write Your Math Note: ");
        math = input.nextInt();

        System.out.println("Please Write Your Literature Note: ");
        lit = input.nextInt();

        System.out.println("Please Write Your Chemistry Note: ");
        chem = input.nextInt();

        System.out.println("Please Write Your History Note: ");
        his = input.nextInt();

        System.out.println("Please Write Your Musik Note: ");
        mus = input.nextInt();

        int total = math+lit+chem+his+mus;
        double result = total / 5;
        boolean realresult = result >= 50 ;
        String vresult = realresult ? "Passed" : "Not Succesful";
        System.out.println("Your Average Note is: " +result);
        System.out.println(vresult);




    }
}
