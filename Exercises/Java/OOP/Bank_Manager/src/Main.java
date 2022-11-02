import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // INSTANTIATING ACCOUNTS
        Account account1 = new Account(1,42387.60);
        Account account2 = new Account(2,-1032.20);
        Account account3 = new Account(3,2345.34);
        Account account4 = new Account(4,1987.23);

        // INSTANTIATING CLIENTS && THEIR ACCOUNTS LIST
        List<Account> accounts1 = new ArrayList<>();
        accounts1.add(account1);
        accounts1.add(account2);
        Customer customer1 = new Customer("Ciccio", "cic42", accounts1);

        List<Account> accounts2 = new ArrayList<>();
        accounts2.add(account3);
        accounts2.add(account4);
        Customer customer2 = new Customer("Bello", "bel23", accounts2);

        // INSTATIATING BANKS && THEIR CLIENTS
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        List<Account> bankAccounts = new ArrayList<>();
        bankAccounts.add(account1);
        bankAccounts.add(account2);
        bankAccounts.add(account3);
        bankAccounts.add(account4);
        Bank bank1 = new Bank("UniCredit", customers, bankAccounts);

        // OUTPUT
        System.out.println(bank1);
        System.out.println(customers);
        System.out.println(bankAccounts);

    }
}