import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Number of grades must be greater than zero.");
            return;
        }

        double[] grades = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        double average = sum / n;

        System.out.printf("📊 Average Grade: %.2f%n", average);

        sc.close();
    }
}
