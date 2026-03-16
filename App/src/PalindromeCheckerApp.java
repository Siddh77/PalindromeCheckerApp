//version 12.0
//author Siddharth K
//use case 12: Strategy Pattern for Palindrome Algorithms
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute algorithm
        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {

    boolean check(String input);
}



class StackStrategy implements PalindromeStrategy {



    public boolean check(String input) {

        // Create stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of input onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}



