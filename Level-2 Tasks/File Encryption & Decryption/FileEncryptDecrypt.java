import java.io.*;
import java.util.Scanner;

public class FileEncryptDecrypt {

    private static final int SHIFT = 3; // encryption key

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== FILE ENCRYPTION / DECRYPTION ===");
        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter input file path: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = sc.nextLine();

        try {
            if (choice == 1) {
                processFile(inputFile, outputFile, SHIFT);
                System.out.println("File encrypted successfully.");
            } else if (choice == 2) {
                processFile(inputFile, outputFile, -SHIFT);
                System.out.println("File decrypted successfully.");
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    private static void processFile(String input, String output, int shift) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch + shift);
        }

        reader.close();
        writer.close();
    }
}
