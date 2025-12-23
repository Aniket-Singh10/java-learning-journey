import java.util.Scanner;

// Program to demonstrate switch-case statements in Java
public class SwitchCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --------- Switch Case Example 1: Age based message ---------
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are becoming an adult.");
                break;
            case 24:
                System.out.println("You may start your professional career.");
                break;
            case 60:
                System.out.println("You are approaching retirement.");
                break;
            default:
                System.out.println("Enjoy your life!");
        }

        System.out.println("Thank you for using this Java program.\n");

        // --------- Switch Case Example 2: Day of the week ---------
        System.out.print("Enter a number (1–7) for day of week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("Invalid day number");
        }

        sc.close();
    }
}

