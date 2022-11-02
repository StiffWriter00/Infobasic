import java.util.List;
public class Bank {

    // ISTANCE VARIABLES
    private String name;
    private List<Customer> customers;
    private List<Account> accounts;

    // CONSTRUCTOR
    public Bank(String name, List<Customer> customers, List<Account> accounts) {
        this.name = name;
        this.customers = customers;
        this.accounts = accounts;
    }

    // GETTERS && SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    // toString
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                ", accounts=" + accounts +
                '}';
    }

}