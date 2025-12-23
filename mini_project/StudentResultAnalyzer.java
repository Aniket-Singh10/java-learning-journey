import java.util.Scanner;

// Mini Project: Student Result Analyzer
public class StudentResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking marks of 5 subjects with validation
        System.out.print("Enter marks of Subject 1: ");
        float s1 = sc.nextFloat();
        while (s1 < 0 || s1 > 100) {
            System.out.print("Invalid! Enter again (0–100): ");
            s1 = sc.nextFloat();
        }

        System.out.print("Enter marks of Subject 2: ");
        float s2 = sc.nextFloat();
        while (s2 < 0 || s2 > 100) {
            System.out.print("Invalid! Enter again (0–100): ");
            s2 = sc.nextFloat();
        }

        System.out.print("Enter marks of Subject 3: ");
        float s3 = sc.nextFloat();
        while (s3 < 0 || s3 > 100) {
            System.out.print("Invalid! Enter again (0–100): ");
            s3 = sc.nextFloat();
        }

        System.out.print("Enter marks of Subject 4: ");
        float s4 = sc.nextFloat();
        while (s4 < 0 || s4 > 100) {
            System.out.print("Invalid! Enter again (0–100): ");
            s4 = sc.nextFloat();
        }

        System.out.print("Enter marks of Subject 5: ");
        float s5 = sc.nextFloat();
        while (s5 < 0 || s5 > 100) {
            System.out.print("Invalid! Enter again (0–100): ");
            s5 = sc.nextFloat();
        }

        // Calculating percentage
        float percentage = (s1 + s2 + s3 + s4 + s5) / 500 * 100;

        System.out.println("\nPercentage: " + percentage + "%");

        // Pass / Fail condition
        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // Grade calculation
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}

