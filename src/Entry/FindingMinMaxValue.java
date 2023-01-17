package Entry;
import java.util.Scanner;
public class FindingMinMaxValue {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("How Many Number Do You Want to Write : ");
        x = input.nextInt();

        //calling
        int numbers[] = add(x);
        sort(numbers);
        result(numbers);
    }
    static int[] add(int x){
        int numbers[]=new int[x];
        Scanner input = new Scanner(System.in);
        System.out.println("Add is Working");
        for (int i = 1;i<=x;i++){
            System.out.print(i+". Number : ");
            int y = input.nextInt();
            numbers[i-1] = y;
        }
        return numbers;
    }
    static void sort(int numbers[]){
        System.out.println("Sort is Working");
        for (int j = 0; j<numbers.length; j++){
            int min = numbers[j];
            int indexMin = j;

            for (int k= j+1; k<numbers.length; k++){
                if (numbers[k]<min){
                    min=numbers[k];
                    indexMin = k;
                }
            }
            int a = numbers[j];
            numbers[j] = min;
            numbers[indexMin] = a;
        }
    }
    static void result(int numbers[]) {
        System.out.println("Result is Working");
        System.out.println("Max number is : " + numbers[numbers.length-1]);
        System.out.println("Min number is : " + numbers[0]);
    }
}
