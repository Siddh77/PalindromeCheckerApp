//version 11.0
//author Siddharth K
//use case 11: Object-Oriented Palindrome Service
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean result = service.checkPalindrome(input);
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}
    class PalindromeService {

        /**
         * Checks whether the input string is a palindrome.
         *
         * @param input Input string
         * @return true if palindrome, false otherwise
         */
        public boolean checkPalindrome(String input) {
            // Initialize pointers
            int start = 0;
            int end = input.length() - 1;

            // Compare characters moving inward
            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false; // Not a palindrome
                }
                start++;
                end--;
            }
            return true; // Is a palindrome
        }
    }

