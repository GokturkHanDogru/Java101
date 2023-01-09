package Entry;

public class Operators {
    public static void main(String[] args) {
        int x = 4 , y = 2 , z = 4;
        // y = y + x;
        y += x;
        System.out.println(y);
        boolean result = x == y;
        System.out.println(result);

        boolean con1 = x == z;
        boolean con2 = x < y;
        boolean result2 = con1 || con2 ; // or same condition in one row i.e result 3
        boolean result3 = ((x==z) || (x<y));
        System.out.println(result2);
        System.out.println(result3);// or there is another way to see same result with String type

        String vStr = result2 ? "True" : "False" ;
        System.out.println(vStr);
    }
}
