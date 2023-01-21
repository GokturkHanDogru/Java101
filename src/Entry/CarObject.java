package Entry;

public class CarObject {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "RS7 quatro";
        audi.speed = 50;
        audi.increaseSpeed(120);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "3.40 M Performance";
        bmw.speed = 65;
        bmw.increaseSpeed(110);
        bmw.decreaseSpeed(15);
        bmw.printSpeed();

    }
}
