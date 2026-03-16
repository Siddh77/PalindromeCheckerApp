//version 8.0
//author Siddharth K
//use case 8: Linked List Based Palindrome Checker
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "level";
        System.out.println("Input : " + input);

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        // Converting to lowercase to ensure case-insensitive comparison
        for (char c : input.toLowerCase().toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove first and last characters and compare them
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


