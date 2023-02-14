package Entry;

public class ArraysPractice1 {
    public static void main(String[] args) {
        int list[]={12,53,65,89,45,23};
        double total=0.0;

        for (int i = 0; i<list.length; i++){
            total+=list[i];
        }
        double average = total/ list.length;
        System.out.println(average);

        int [] list2 = {1,2,3,4,5};
        double sum=0.0;

        for (int i = 0; i<list2.length; i++){
            sum+=(1.0/list2[i]);
        }
        System.out.println("Harmonica: "+(list2.length/sum));
        }
    }

