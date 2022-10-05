// IMPORT PACKAGE
package Module_1;

// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Ex1 {

    //MAIN
    public static void main(String[] args) {

        // CREATE SCAN OBJECT
        Scanner scanner = new Scanner(System.in);

        // INPUT FIRST NUMBER
        Double first_number = 0.0;
        try {
            System.out.println("\nInsert the first number:");
            first_number = Double.parseDouble(scanner.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println("\nInsert numbers only!\n");
            System.exit(1);
        }

        // INPUT SECOND NUMBER
        Double second_number = 0.0;
        try {    
            System.out.println("\nInsert the second number:");
            second_number = Double.parseDouble(scanner.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println("\nInsert numbers only!\n");
            System.exit(1);
        }

        // SUM RESULT
        System.out.println("\nThe sum result is ---> " + (first_number + second_number));

        // SUBSTRACTION RESULT
        System.out.println("The substraction result is ---> " + (first_number - second_number));

        // MULTIPLICATION RESULT
        System.out.println("The multiplication result is ---> " + (first_number * second_number));

        // DIVISION RESULT
        System.out.println("The division result is ---> " + (first_number / second_number) + "\n");

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}