// MAIN
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("coffee", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        Dispenser dispenser = new Dispenser(10);
        dispenser.loadProduct(coffee);
        dispenser.loadProduct(coffee);
        dispenser.loadProduct(cappuccino);
        dispenser.loadProduct(coffee);
        dispenser.loadProduct(coffee);
        dispenser.loadProduct(cappuccino);
        dispenser.loadProduct(coffee);
        System.out.println(dispenser.getCurrentBalance() == 0);
        System.out.println(dispenser.getResto() == 0);
        dispenser.insertAmount(0.4);
        System.out.println(dispenser.chooseProduct("coffee") == null);
        dispenser.insertAmount(0.2);
        System.out.println(dispenser.chooseProduct("coffee") != null);
        System.out.println(dispenser.getResto()-0.10 < 1E-6);
        System.out.println(dispenser.getCurrentBalance() == 0);
        System.out.println(dispenser.chooseProduct("coffee") == null);
        dispenser.insertAmount(2.0);
        System.out.println(dispenser.chooseProduct("coffee") != null);
        System.out.println(dispenser.chooseProduct("cappuccino") != null);
        System.out.println(dispenser.chooseProduct("coffee") != null);
        System.out.println(dispenser.getCurrentBalance() == 0);
        System.out.println(dispenser.getResto()-0.10 < 1E-6);
    }
}