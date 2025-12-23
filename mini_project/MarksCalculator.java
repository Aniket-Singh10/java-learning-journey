import java.util.Scanner;

// Mini project: Marks Calculator with input validation
public class MarksCalculator {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Taking marks for five subjects (0 to 100)

        System.out.print("Enter marks of first subject: ");
        float a = x.nextFloat();
        while (a < 0 || a > 100) {
            System.out.println("Invalid! Marks must be between 0 and 100.");
            System.out.print("Enter again: ");
            a = x.nextFloat();
        }

        System.out.print("Enter marks of second subject: ");
        float b = x.nextFloat();
        while (b < 0 || b > 100) {
            System.out.println("Invalid! Marks must be between 0 and 100.");
            System.out.print("Enter again: ");
            b = x.nextFloat();
        }

        System.out.print("Enter marks of third subject: ");
        float c = x.nextFloat();
        while (c < 0 || c > 100) {
            System.out.println("Invalid! Marks must be between 0 and 100.");
            System.out.print("Enter again: ");
            c = x.nextFloat();
        }

        System.out.print("Enter marks of fourth subject: ");
        float d = x.nextFloat();
        while (d < 0 || d > 100) {
            System.out.println("Invalid! Marks must be between 0 and 100.");
            System.out.print("Enter again: ");
            d = x.nextFloat();
        }

        System.out.print("Enter marks of fifth subject: ");
        float e = x.nextFloat();
        while (e < 0 || e > 100) {
            System.out.println("Invalid! Marks must be between 0 and 100.");
            System.out.print("Enter again: ");
            e = x.nextFloat();
        }

        // Calculating percentage
        float percentage = (a + b + c + d + e) / 500 * 100;

        // Displaying result
        System.out.println("Percentage = " + percentage + "%");

        x.close();
    }
}

