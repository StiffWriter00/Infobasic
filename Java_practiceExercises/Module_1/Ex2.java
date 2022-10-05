// IMPORT PACKAGE
package Module_1;

// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Ex2 {
    
    // MAIN
    public static void main(String[] args) {

        // CREATE SCAN OBJECT
        Scanner scanner = new Scanner(System.in);
        
        // INPUT NUMBER
        Double number = 0.0;
        try {
            System.out.println("\nInsert a number:");
            number = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("\nInsert numbers only!\n");
            System.exit(1);
        }
        
        // RESULT SHOW
        if ((number % 2) == 0) {
            System.out.println("\n" + true + "\n");
            System.exit(0);
        } else {
            System.out.println("\n" + false + "\n");
            System.exit(0);
        }

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}
