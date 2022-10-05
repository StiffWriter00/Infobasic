// IMPORT PACKAGE
package Module_1;

// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Ex4 {

    // MAIN
    public static void main(String[] args) {

        // CREATE SCAN OBJECT
        Scanner scanner = new Scanner(System.in); 

        // INPUT LETTER 'A'
        System.out.println("\nInsert the first letter:");
        String a_input = scanner.nextLine();
        char a_letter = a_input.charAt(0);

        // INPUT LETTER 'B'
        System.out.println("\nInsert the second letter:");
        String b_input = scanner.nextLine();
        char b_letter = b_input.charAt(0);

        // INPUT STRING WITH TWO SPACES
        System.out.println("\nInsert a string with two spaces:");
        String c_input = scanner.nextLine();

        // GET THE STRING WITHOUT SPACES
        String[] c_words = c_input.split(" ");
        String c_string = c_words[1];

        // REPLACE CHARACTERS
        char[] c_string_array = c_string.toCharArray();
        for(int i = 0; i < c_string_array.length; i++) {
            if(c_string_array[i] == a_letter) {
                c_string_array[i] = b_letter;
            }
        }
        c_string = new String(c_string_array);
        c_words[1] = c_string;
        
        // OUTPUT THE UPDATED C STRING
        for(int i = 0; i < c_words.length; i++) {
            System.out.print(c_words[i] + " ");
        }

        // CLOSE SCAN OBJECT && EXIT PROGRAM
        scanner.close();
        System.exit(0);
    }
}