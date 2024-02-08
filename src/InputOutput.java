/**InputOutput.java
 * This file is responsible for all input / output operations to console.
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * Date: 2024-02-08
 */
import java.util.Scanner;
public class InputOutput {
    /**
     * Constructs an InputOutput object with a Scanner object initialized with System.in.
     */
    Scanner input = new Scanner(System.in);
    /**
     * Prints the given string to the standard output stream.
     * @param s the string to be printed
     */
    public void printString(String s){
        System.out.println(s);
    }

    /**
     * Prompts the user for input, validates the input, and returns it.
     * The input is considered valid if it contains only alphanumeric characters,
     * spaces, and certain special characters (@, ., _, -), and is not empty.
     * If the input is invalid, appropriate error messages are displayed, and the user is prompted again.
     * @return the valid user input
     */
    public String getValidUserInput(){
        String userInput;
        boolean isUserInputInvalid;

        do {
            userInput = input.nextLine();
            if (!userInput.matches("[-a-zA-ZåäöÅÄÖ0-9@._ ]+")) {
                System.out.println("Incorrect format, you cannot use special characters!");
                isUserInputInvalid = true;
            } else if (userInput.isEmpty()) {
                System.out.println("entry cannot be blank..");
                isUserInputInvalid = true;
            } else {
                isUserInputInvalid = false;
            }

        } while (isUserInputInvalid);

        return userInput;
    }
}
