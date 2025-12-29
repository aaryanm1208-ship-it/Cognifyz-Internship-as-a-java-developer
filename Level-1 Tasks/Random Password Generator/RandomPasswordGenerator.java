import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter desired password length: ");
        int length = sc.nextInt();

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean useLower = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean useUpper = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean useNumbers = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean useSpecial = sc.next().equalsIgnoreCase("yes");

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        StringBuilder characterPool = new StringBuilder();

        if (useLower) characterPool.append(lowercase);
        if (useUpper) characterPool.append(uppercase);
        if (useNumbers) characterPool.append(numbers);
        if (useSpecial) characterPool.append(special);

        if (characterPool.length() == 0 || length <= 0) {
            System.out.println("❌ Invalid input. Please select at least one character type and valid length.");
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        System.out.println("🔐 Generated Password: " + password);

        sc.close();
    }
}
