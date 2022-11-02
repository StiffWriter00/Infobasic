// DISPENSER CLASS
public class Dispenser {

    // ISTANCE VARIABLES
    private double currentBalance;
    private Product[] products;

    // CONSTRUCTOR
    public Dispenser(int capacity) {
        this.products = new Product[capacity];
        this.currentBalance = 0;
    }

    // GETTERS
    public double getCurrentBalance() {
        return currentBalance;
    }
    public double getResto() {
        double app = currentBalance;
        currentBalance = 0;
        return  app;
    }

    // CHOOSE PRODUCT METHOD
    public Product chooseProduct(String codice) {
        Product product = null;
        for(int i=0; i<products.length; i++)
            if (products[i] != null && products[i].getCode().equals(codice)) {
                if(products[i].getPrice() <= currentBalance) {
                    currentBalance -= products[i].getPrice();
                    product =  products[i];
                    removeProduct(i);
                    break;
                }
            }
        return product;
    }

    // LOAD PRODUCT METHOD
    public void loadProduct(Product product) {
        for(int i = 0; i < products.length; i++)
            if (products[i] == null) {
                products[i] = product;
                break;
            }
    }

    // REMOVE PRODUCT METHOD
    public void removeProduct(int index) {
        for(int i = index; i < products.length-1; i++)
            products[i] = products[i+1];
        products[products.length-1] = null;
    }

    // INSERT AMOUNT METHOD
    public void insertAmount(double balance) {
        currentBalance += balance;
    }

}