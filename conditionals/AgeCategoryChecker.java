import java.util.Scanner;

// Program to determine age category using if-else conditions
public class AgeCategoryChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking age input from user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Validating age
        if (age < 0) {
            System.out.println("Invalid age entered.");
        }
        else if (age <= 12) {
            System.out.println("Category: Child");
        }
        else if (age <= 19) {
            System.out.println("Category: Teenager");
        }
        else if (age <= 59) {
            System.out.println("Category: Adult");
        }
        else {
            System.out.println("Category: Senior Citizen");
        }

        sc.close();
    }
}