//version 10.0
//author Siddharth K
//use case 10: Case-Insensitive & Space-Ignored Palindrome
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prompt
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 1. Normalization: Remove symbols/spaces and convert to lowercase
        // [^a-zA-Z0-9] matches anything that is NOT a letter or a digit
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Palindrome Logic (based on your hint)
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Output result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

