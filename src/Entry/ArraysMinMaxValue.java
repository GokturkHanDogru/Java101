package Entry;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysMinMaxValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Write a Number:");
        int number = input.nextInt();

        int [] list = {12,54,-98,35,16,-45,6,78,number};

        Arrays.sort(list);
        int index = Arrays.binarySearch(list,number);
        int nearMin= list[index-1];
        int nearMax= list[index+1];
        System.out.println(nearMin);
        System.out.println(nearMax);




    }

}
