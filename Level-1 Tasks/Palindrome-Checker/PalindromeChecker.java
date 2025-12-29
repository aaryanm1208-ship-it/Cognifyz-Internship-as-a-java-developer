import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        // Remove non-alphabetic characters and convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ The given input is a palindrome.");
        } else {
            System.out.println("❌ The given input is NOT a palindrome.");
        }

        sc.close();
    }
}
