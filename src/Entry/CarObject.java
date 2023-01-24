package Entry;

public class CarObject {
    public static void main(String[] args) {
        Car audi = new Car("RS7 quatro", 50,"Olive Green");
        audi.printInfo();
        audi.increaseSpeed(120);
        audi.printSpeed();

        System.out.println("=============");

        Car bmw = new Car();
        bmw.model = "3.40 M Performance";
        bmw.speed = 65;
        bmw.increaseSpeed(110);
        bmw.decreaseSpeed(15);
        bmw.printSpeed();



    }
}
