import java.util.Scanner;

// Program to convert distance from kilometers to miles
public class KmToMilesConverter {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter distance in kilometers
        System.out.print("Enter value in kilometers: ");
        float km = sc.nextFloat();

        // Conversion formula: 1 km = 0.621371 miles
        float miles = km * 0.621371f;

        // Display the result
        System.out.println("Value in miles: " + miles);

        // Close scanner resource
        sc.close();
    }
}

