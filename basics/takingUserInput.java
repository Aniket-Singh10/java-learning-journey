import java.util.Scanner;

// Program to demonstrate taking user input using Scanner
public class takingUserInput {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner x = new Scanner(System.in);

        // Taking first number as float
        System.out.print("Enter No. 1: ");
        float a = x.nextFloat();

        // Taking second number as float
        System.out.print("Enter No. 2: ");
        float b = x.nextFloat();

        // Calculating sum
        float sum = a + b;
        System.out.println("The sum of numbers is: " + sum);

        // Checking whether next input is an integer
        boolean isInt = x.hasNextInt();
        System.out.println("Is next input an integer? " + isInt);

        // Consuming the leftover newline
        x.nextLine();

        // Taking string input
        System.out.print("Enter a string: ");
        String str = x.nextLine();
        System.out.println("You entered: " + str);

        // Closing scanner resource
        x.close();
    }
}
