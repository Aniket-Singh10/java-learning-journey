import java.util.Scanner;

// Program to demonstrate basic String usage and formatted output in Java
public class StringsDemo {

    public static void main(String[] args) {

        // Declaring and printing a String
        String name = "Ansh";
        System.out.println("The name is: " + name);

        // Demonstrating formatted output using printf
        int a = 8;
        float b = 45.24f;

        System.out.printf("The value of a is %d and the value of b is %f%n", a, b);
        System.out.printf("The value of a is %10d and the value of b is %15f%n", a, b);

        /*
         * Format specifiers:
         * %d → integer
         * %f → float
         * %c → character
         * %s → string
         */

        // Taking String input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        System.out.println("You entered: " + str);

        // Closing scanner resource
        sc.close();
    }
}

