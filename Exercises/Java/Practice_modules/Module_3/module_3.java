import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

// CLASS
public class module_3 {

    // MAIN
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // CHOOSE WHICH PROGRAM TO RUN
        while(true) {

            // WELCOME MESSAGE && INPUT REQUEST
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("\nWELCOME!\nModule N°3 is running...\n\nWARNING! The following programs do NOT have error handling due to the basic nature of the exercises on which they are based.\nPlease follow the instructions on the pdf.\n\nPlease choose the program you want to run:\n");

            // SPECIFY INPUT INSTRUCTIONS
            System.out.println("1 ---> ");
            System.out.println("2 ---> ");
            System.out.println("3 ---> ");
            System.out.println("4 ---> ");
            System.out.println("5 ---> ");
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
                            // function 1
                            break;

                        // CALL EXERCISE N°2
                        case '2':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            // function 2
                            break;

                        // CALL EXERCISE N°3
                        case '3':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            // function 3
                            break;

                        // CALL EXERCISE N°4
                        case '4':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            // function 4
                            break;

                        // CALL EXERCISE N°5
                        case '5':
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            // function 5
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

}