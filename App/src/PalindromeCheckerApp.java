//version 7.0
//author Siddharth K
//use case 7: Deque-Based Optimized Palindrome Checker
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";
        System.out.println("Input : " + input);

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            // If characters from both ends don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

