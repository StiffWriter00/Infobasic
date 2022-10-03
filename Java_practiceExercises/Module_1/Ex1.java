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
            System.out.println("\nInserici il primo numero:");
            first_number = Double.parseDouble(scanner.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println("\nInserire solo numeri!\n");
            System.exit(1);
        }

        // INPUT SECOND NUMBER
        Double second_number = 0.0;
        try {    
            System.out.println("\nInserici il secondo numero:");
            second_number = Double.parseDouble(scanner.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println("\nInserire solo numeri!\n");
            System.exit(1);
        }

        // SUM RESULT
        System.out.println("\nLa somma è ---> " + (first_number + second_number));

        // SUBSTRACTION RESULT
        System.out.println("La sottrazione è ---> " + (first_number - second_number));

        // MULTIPLICATION RESULT
        System.out.println("La moltiplicazione è ---> " + (first_number * second_number));

        // DIVISION RESULT
        System.out.println("La divisione è ---> " + (first_number / second_number) + "\n");

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}