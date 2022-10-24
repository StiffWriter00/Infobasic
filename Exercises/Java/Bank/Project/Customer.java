import java.util.List;
public class Customer {

    // ISTANCE VARIBALES
    private String name;
    private String fiscalCode;
    private List<Account> accounts;

    // CONSTRUCTOR
    public Customer(String name, String fiscalCode, List<Account> accounts) {
        this.name = name;
        this.fiscalCode = fiscalCode;
        this.accounts = accounts;
    }

    // toString
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    // GETTERS && SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }
}
