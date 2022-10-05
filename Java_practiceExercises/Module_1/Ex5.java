// IMPORT PACKAGE
package Module_1;

// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Ex5 {

    // MAIN
    public static void main(String[] args) {

        // CREATE SCAN OBJECT
        Scanner scanner = new Scanner(System.in); 

        // INPUT STRING 'A'
        System.out.println("\nInserire la prima stringa:");
        String string_a = scanner.nextLine();

        // INPUT STRING 'B'
        System.out.println("\nInserire la seconda stringa:");
        String string_b = scanner.nextLine();

        // INPUT STRING 'C'
        System.out.println("\nInserire la terza stringa:");
        String string_c = scanner.nextLine();

        // CHECK FOR EQUAL STRINGS AND PRINT COUNTER
        int counter = 0;
        String[] array = {string_a, string_b, string_c};
        if(string_a.equals(string_b) && string_b.equals(string_c)) {counter = 3;}
        else {
            for(int i = 0; i < array.length; i++) {
                for(int x = 0; x < array.length; x++) {
                    if(x != i) {
                        if(array[i].equals(array[x])) {
                            counter += 1;
                        }
                    }
                }
            }
        }
        System.out.println("\nIl numero di stringhe uguali è " + counter + ".\n");

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}