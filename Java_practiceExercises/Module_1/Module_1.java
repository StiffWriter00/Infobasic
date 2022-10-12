// IMPORT MODULE
import java.util.Scanner;

// CLASS
public class Module_1 {

    // MAIN
    public static void main(String[] args) {

    // ASK THE USER WHICH PROGRAM TO EXECUTE
	System.out.println("\nWELCOME!\nPlease choose the program you want to run:\n");
	chooseProgram();

    }

    // FUNCTION TO CHOOSE WHICH PROGRAM TO RUN
    private static void chooseProgram() {

        // SPECIFY INPUT INSTRUCTIONS
        System.out.println("1 ---> Aritmetic operators");
        System.out.println("2 ---> Even or odds");
        System.out.println("3 ---> Invert string");
        System.out.println("4 ---> Replace intruders");
        System.out.println("5 ---> Compare strings");
	
        // CREATE SCAN OBJECT && INPUT
        Scanner scanner = new Scanner(System.in); 

        // USER INPUT
        System.out.println("\nInsert the number corrisponding to the program in order to run it:");
        String input = scanner.next();
        //if(input != 'as') {
            System.out.println("\nInvalid input");
            chooseProgram();
    //    }

    }

	// SWITCH CASE CHOISE
	


    // EXERCISE N°1
    private static void aritmeticOperators() {

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

    // EXERCISE N°2
    public static void evenOrOdds() {

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

    // EXERCISE N°3
    public static void invertString() {
        
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

    // EXERCISE N°4
    public static void replaceIntruders() {

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

    // EXERCISE N°5
    public static void compareStrings() {

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
