// PRODUCT CLASS - FATHER CLASS
class Product {
    
    // ISTANCE VARIABLES
    private String code;
    private double price;

    // CONSTRUCTOR
    public Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    // GETTERS
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }

}