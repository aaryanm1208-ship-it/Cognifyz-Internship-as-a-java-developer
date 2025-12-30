import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;

        if (password.matches(".*[A-Z].*")) score++;

        if (password.matches(".*[a-z].*")) score++;

        if (password.matches(".*[0-9].*")) score++;

        if (password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~`].*")) score++;

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Strength: WEAK");
            System.out.println("Suggestion: Use at least 8 characters, include uppercase, lowercase, numbers, and special symbols.");
        } else if (score == 3 || score == 4) {
            System.out.println("Strength: MEDIUM");
            System.out.println("Suggestion: Add more character variety for better security.");
        } else {
            System.out.println("Strength: STRONG");
            System.out.println("Good job! Your password is secure.");
        }

        sc.close();
    }
}
