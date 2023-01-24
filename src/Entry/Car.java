package Entry;

public class Car {
    String colour;
    String type;
    String model;
    int  speed;
    int speedLimit;

    Car(String model, int speed, String colour){
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.type = "Sports";
        this.speedLimit =180;

    }
    Car(){
        System.out.println("Empty Method was Created!");
    }

    void increaseSpeed(int increment) {

        if (this.speed + increment <= this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decreasement) {

        if (this.speed > 0) {
            this.speed -= decreasement;
        }
    }
    void printSpeed(){
        System.out.println(this.model + "Current Speed is : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model \t:"+this.model);
        System.out.println("Colour \t:"+this.colour);
        System.out.println("Type \t:"+this.type);
        System.out.println("Speed \t:"+this.speed);
    }
}

