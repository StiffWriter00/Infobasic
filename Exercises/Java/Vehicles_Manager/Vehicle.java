// VEHICLE SUPERCLASS
public class Vehicle {

    // ISTANCE VARIABLES
    private String licensePlate;
    private int seatsNumber;

    // CONSTRUCTOR
    public Vehicle(String licensePlate, int seatsNumber) {
        this.licensePlate = licensePlate;
        this.seatsNumber = seatsNumber;
    }

    // SETTERS
    public void set_licensePlate(String licensePlate) {this.licensePlate = licensePlate;}
    public void set_seatsNumber(int seatsNumber) {this.seatsNumber = seatsNumber;}

    // GETTERS
    public String get_licensePlate() {return licensePlate;}
    public int get_seatsNumber() {return seatsNumber;}

}