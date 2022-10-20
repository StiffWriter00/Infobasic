// IMPORT MODULES
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

// CLASS
public class module_1 {

    // MAIN
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // CHOOSE WHICH PROGRAM TO RUN
        while(true) {

            // WELCOME MESSAGE && INPUT REQUEST
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("\nWELCOME!\nModule N°1 is running...\n\nWARNING! The following programs do NOT have error handling due to the basic nature of the exercises on which they are based.\nPlease follow the instructions on the pdf.\n\nPlease choose the program you want to run:\n");

            // SPECIFY INPUT INSTRUCTIONS
            System.out.println("1 ---> Aritmetic operators");
            System.out.println("2 ---> Even or odds");
            System.out.println("3 ---> Invert string");
            System.out.println("4 ---> Replace intruders");
            System.out.println("5 ---> Compare strings");
            System.out.println("6 ---> Exit");
        
            // CREATE SCANNER OBJECT && USER INPUT
            Scanner scannerMain = new Scanner(System.in); 
            System.out.println("\nInsert the number corrisponding to the program in order to run it:");
            String rawInput = scannerMain.nextLine();

            // INPUT HANDLING
            try {

                if(rawInput.length() == 1) {
                    char input = rawInput.charAt(0);
                    switch(input) {

                        // CALL EXERCISE N°1
                        case '1':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            aritmeticOperators();
                            break;

                        // CALL EXERCISE N°2
                        case '2':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            evenOrOdds();
                            break;

                        // CALL EXERCISE N°3
                        case '3':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            invertString();
                            break;

                        // CALL EXERCISE N°4
                        case '4':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            replaceIntruders();
                            break;

                        // CALL EXERCISE N°5
                        case '5':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            compareStrings();
                            break;

                        // EXIT MAIN
                        case '6':
                            scannerMain.close();
                            System.out.println("\nBye!\n");
                            Thread.sleep(2000);
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            System.exit(0);

                        default:
                            System.out.println("\nInvalid input!");
                            Thread.sleep(2000);
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            continue;

                        }
                    
                    System.out.println("\n\nPress enter to continue."); try{System.in.read();} catch(Exception e){}
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    continue;
                
                    } else {
                        System.out.println("\nInvalid input!");
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        continue;
                    }

            } catch(InputMismatchException ex) {
                System.out.println("\nInvalid input!");
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                continue;
            }

        }

    }

    // EXERCISE N°1
    private static void aritmeticOperators() {

        // CREATE SCANNER OBJECT
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

        // PRINT SUM RESULT
        System.out.println("\nThe sum result is ---> " + (first_number + second_number));

        // PRINT SUBSTRACTION RESULT
        System.out.println("The substraction result is ---> " + (first_number - second_number));

        // PRINT MULTIPLICATION RESULT
        System.out.println("The multiplication result is ---> " + (first_number * second_number));

        // PRINT DIVISION RESULT
        System.out.println("The division result is ---> " + (first_number / second_number));

    }

    // EXERCISE N°2
    private static void evenOrOdds() {

        // CREATE SCANNER OBJECT
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
        
        // PRINT RESULT
        if ((number % 2) == 0) {
            System.out.println("\n" + true);
        } else {
            System.out.println("\n" + false);
        }

    }

    // EXERCISE N°3
    private static void invertString() {
        
        // CREATE SCANNER OBJECT
        Scanner scanner = new Scanner(System.in); 

        // INPUT STRING
        System.out.println("\nInsert a phrase:");
        String string = scanner.nextLine();

        // INITIALIZE ARRAY
        String[] words = string.split(" ");
        System.out.print("\n");

        // PRINT INVERTED WORDS
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }

    // EXERCISE N°4
    private static void replaceIntruders() {

        // CREATE SCANNER OBJECT
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
        
        // PRINT THE UPDATED C STRING
        for(int i = 0; i < c_words.length; i++) {
            System.out.print(c_words[i] + " ");
        }

    }

    // EXERCISE N°5
    private static void compareStrings() {

        // CREATE SCANNER OBJECT
        Scanner scanner = new Scanner(System.in); 

        // INPUT STRING 'A'
        System.out.println("\nInsert the first string:");
        String string_a = scanner.nextLine();

        // INPUT STRING 'B'
        System.out.println("\nInsert the second string:");
        String string_b = scanner.nextLine();

        // INPUT STRING 'C'
        System.out.println("\nInsert the third string:");
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
        System.out.println("\nThe number of equal strings is " + counter + ".");

    }

}
