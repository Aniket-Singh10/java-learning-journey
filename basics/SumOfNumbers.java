import java.util.Scanner;

// Program to calculate the sum of three numbers using user input
public class SumOfNumbers {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking three numbers from user
        System.out.print("Enter number 1: ");
        float a = sc.nextFloat();

        System.out.print("Enter number 2: ");
        float b = sc.nextFloat();

        System.out.print("Enter number 3: ");
        float c = sc.nextFloat();

        // Calculating sum
        float sum = a + b + c;

        // Displaying result
        System.out.println("Sum of the numbers is: " + sum);

        // Close scanner resource
        sc.close();
    }
}

