//version 4.0
//author Siddharth K
//use case 4: Character Array Based Palindrome Check

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // 2. Convert the string into a character array
        char[] chars = input.toCharArray();

        // 3. Initialize pointer at the beginning
        int start = 0;

        // 4. Initialize pointer at the end
        int end = chars.length - 1;

        // 5. Assume palindrome initially
        boolean isPalindrome = true;

        // 6. Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
            // Move pointers towards the middle
            start++;
            end--;
        }

        // 7. Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
