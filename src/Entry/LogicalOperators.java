package Entry;

public class LogicalOperators {
    public static void main(String[] args) {
        int x=10, y=20, z=5;

        boolean con1 = x<y;
        boolean con2 = y<z;
        boolean result = con1 || con2 ;

        System.out.println(result);

        // or 2nd way

        int a=2, b=3, c;
        c = a<=b ? 1:0;
        System.out.println(c);
    }
}
