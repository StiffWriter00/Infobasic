public class Operation {

    // ISTANCE VARIABLES
    private double amount;
    private String operationType;

    // CONSTRUCTOR
    public Operation(double amount) {
        this.amount = amount;
    }

    // GETTERS && SETTERS
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

}
