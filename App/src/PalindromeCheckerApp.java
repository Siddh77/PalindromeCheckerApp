//version 3.0
//author Siddharth K
//use case 3: String Reversal Palindrome Checker
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Variable to store the reversed version of the input
        String reversed = "";

        // --- HINT IMPLEMENTATION ---
        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // ---------------------------

        // Compare original and reversed strings
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();

    }
}
