package Entry;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        int grad;
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Grad is Outside?");
        grad = input.nextInt();

        if (grad<5) {
            System.out.println("Skiing is a good option :)");
        }else if (grad<=25){
                if (grad<=15){
                    System.out.println("There is good Films at Cinema");
                }
                if(grad>=10){
                    System.out.println("I know wonderful places to make a Picnic");
                }
            } else {
            System.out.println("Let's go Swimming");
            }
        }
    }

