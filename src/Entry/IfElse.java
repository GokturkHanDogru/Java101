package Entry;

public class IfElse {
    public static void main(String[] args) {
        int a=10, b=20, c=5;
        if (a<b && a<c){
            System.out.println("A is the smallest number");
        }else if (b<a && b<c){
            System.out.println("B is the smallest number");
        }else {
            System.out.println("C is the smallest number");
        }
// With another way

        if (a<b){
            if (a<c){
                if (a==10){
                    System.out.println("Value of A is 10");
                }
                System.out.println(" A is the smallest number");
            }else{
                System.out.println("A bigger then C");

             }
        }
    }
}
