import java.util.Scanner;

// Program to greet a person using their name
public class GreetPerson {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter their name
        System.out.print("Enter your name: ");
        String name = sc.next();

        // Greeting using println
        System.out.println("Hello " + name + ", have a good day!");

        // Greeting using printf (formatted output)
        System.out.printf("Hello %s, have a good day!", name);

        // Close scanner resource
        sc.close();
    }
}

