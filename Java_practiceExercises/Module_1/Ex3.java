// IMPORT PACKAGE
package Module_1;

// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Ex3 {
    
    // MAIN
    public static void main(String[] args) {
        
        // CREATE SCAN OBJECT
        Scanner scanner = new Scanner(System.in); 

        // INPUT STRING
        System.out.println("\nInsert a phrase:");
        String string = scanner.nextLine();

        // INITIALIZE ARRAY
        String[] words = string.split(" ");
        System.out.print("\n");

        // SHOW INVERTED WORDS
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.print("\n\n");

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}