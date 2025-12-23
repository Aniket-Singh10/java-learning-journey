import java.util.Scanner;

// Mini Project: Result Evaluator
public class ResultEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for each subject (0–100)");

        // Subject 1
        System.out.print("Subject 1: ");
        int a = sc.nextInt();
        while (a < 0 || a > 100) {
            System.out.print("Invalid input. Enter again: ");
            a = sc.nextInt();
        }

        // Subject 2
        System.out.print("Subject 2: ");
        int b = sc.nextInt();
        while (b < 0 || b > 100) {
            System.out.print("Invalid input. Enter again: ");
            b = sc.nextInt();
        }

        // Subject 3
        System.out.print("Subject 3: ");
        int c = sc.nextInt();
        while (c < 0 || c > 100) {
            System.out.print("Invalid input. Enter again: ");
            c = sc.nextInt();
        }

        // Percentage calculation
        float percentage = (a + b + c) / 300.0f * 100;
        System.out.println("Percentage: " + percentage + "%");

        // Result evaluation
        if (a < 33 || b < 33 || c < 33) {
            System.out.println("Result: FAIL (One or more subjects below passing marks)");
        }
        else if (percentage > 90) {
            System.out.println("Result: PASS with Excellent performance");
        }
        else if (percentage >= 40) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }

        System.out.println("Thank you for using this Java program.");

        sc.close();
    }
}

