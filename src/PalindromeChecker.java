/**PalindromeChecker.java
 * This file contains logic to check if a word is a palindrome or not, returns true or false.
 * Author: Robert Tronhage, robert.tronhage@iths.se
 * Date: 2024-02-08
 */
public class PalindromeChecker {
    /**
     * Checks if the given word is a palindrome.
     * A palindrome is a word that reads the same forwards and backwards, ignoring case.
     *
     * @param word the word to be checked for palindrome property
     * @return true if the word is a palindrome, false otherwise
     */
    public boolean isPalindrome(String word){
        word = word.toLowerCase();

        int start = 0;
        int end = word.length()-1;

        while (start < end){
            if (word.charAt(start) != word.charAt(end)){
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }
}