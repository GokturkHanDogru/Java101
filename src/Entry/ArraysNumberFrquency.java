package Entry;
import java.util.Arrays;
public class ArraysNumberFrquency {
    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println(list);
        int count =0;
        Arrays.sort(list);


        for (int i =0; i< list.length; i++){
            for (int j=(i+1); j< list.length;j++){
                if (list[i]==list[j])
                    count++;
                }
                if (i == 0 && list[i] == list[i + 1]) {
                    System.out.println(list[i] + " repeated " + count + " times.");
                }
                if (i == 0 && list[i] != list[i + 1]) {
                    System.out.println(list[i] + " repeated " + count + " times.");
                }
                if (i != 0 && list[i] != list[i - 1]) {
                    System.out.println(list[i] + " repeated " + count + " times.");
                }
            }
        }
    }

