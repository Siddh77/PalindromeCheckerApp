//version 9.0
//author Siddharth K
//use case 9: Recursive Palindrome Checker
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase for accurate checking
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = check(cleanInput, 0, cleanInput.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }


    private static boolean check(String s, int start, int end) {
        // Base case: If markers cross, all characters matched
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center
        return check(s, start + 1, end - 1);
    }
}

