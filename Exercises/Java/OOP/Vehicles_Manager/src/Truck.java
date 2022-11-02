// IMPORT MODULES


// TRUCK SUBCLASS
public class Truck {

    // ISTANCE VARIABLES
    private String licensePlate;
    private int seatsNumber;

    // CONSTRUCTOR
    public Truck(String licensePlate, int seatsNumber) {
        this.licensePlate = licensePlate;
        this.seatsNumber = seatsNumber;
    }

    // toString
    @Override
    public String toString() {
        return "Truck{" +
                "licensePlate=" + licensePlate +
                ", seatsNumber=" + seatsNumber +
                "}";
    }

}