package Entry;

public class Array {

    static int[] reverse (int [] list){
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length-1; i< list.length; i++ , j--){
            reverse[i] = list[j];
        }
        return  reverse;
    }
    static void print (int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {10,20,30,40,50,60,70,80,90,100};
        int[] array = reverse(list);
        print(array);



    }

}
