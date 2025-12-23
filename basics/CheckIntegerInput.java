import java.util.Scanner;

// Program to check whether the given input is an integer or not
public class CheckIntegerInput {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter any input
        System.out.print("Enter something: ");

        // Check if the input is an integer
        if (sc.hasNextInt()) {
            System.out.println("The input is an integer.");
        } else {
            System.out.println("The input is NOT an integer.");
        }

        // Close scanner resource
        sc.close();
    }
}
