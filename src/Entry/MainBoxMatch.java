package Entry;

public class MainBoxMatch {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0,50);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0,50);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}
