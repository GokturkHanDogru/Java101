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
        }
    }

