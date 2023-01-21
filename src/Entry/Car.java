package Entry;

public class Car {
    String colour;
    String type;
    String model;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {

        if (speed + increment <= speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decreasement) {

        if (speed > 0) {
            speed -= decreasement;
        }
    }
    void printSpeed(){
        System.out.println(model + " Speed is : " + speed);
    }

}

