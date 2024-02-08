/**Main.java
 * This file is the entrypoint in application.
 * It prompts the user to enter a word and checks if it is a palindrome using the PalindromeChecker class.
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * Date: 2024-02-08
 */
public class Main {
    /**
     * The main method is the entry point of the application.
     * It initializes InputOutput and PalindromeChecker objects, and starts an interactive loop
     * where the user is prompted to enter a word to check for palindrome property.
     * The loop continues until the user enters '0' to exit the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        InputOutput io = new InputOutput();
        PalindromeChecker PC = new PalindromeChecker();

        while(true){
            io.printString("\nPlease enter word to check if it is a palindrome below (enter '0' to exit): \n");
            String word = io.getValidUserInput();
            if (word.equals("0")){
                io.printString("BYE! :)");
                break;
            }
            if(PC.isPalindrome(word)){
                io.printString("This word is a palindrome");
            }else {
                io.printString("this word is not a palindrome");
            }
        }
    }
}