// CAR SUBCLASS
public class Car extends Vehicle {

    // ISTANCE VARIABLES
    private int doors;

    // CONSTRUCTOR
    public Car(int doors) {
        this.doors = doors;
    }

    // toString
    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ", seatsNumber=" + seatsNumber +
                "}";
    }

}