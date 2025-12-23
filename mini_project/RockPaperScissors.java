import java.util.Scanner;

// Mini Project: Rock Paper Scissors Game
public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Rock Paper Scissors Game");
        System.out.println("Enter 1 for Stone");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissor");

        // User choice
        int userChoice = sc.nextInt();

        // Computer choice (1 to 3)
        int computerChoice = (int) (Math.random() * 3) + 1;

        String userMove = "";
        String computerMove = "";

        // Convert user choice to move
        switch (userChoice) {
            case 1 -> userMove = "Stone";
            case 2 -> userMove = "Paper";
            case 3 -> userMove = "Scissor";
            default -> {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                sc.close();
                return;
            }
        }

        // Convert computer choice to move
        switch (computerChoice) {
            case 1 -> computerMove = "Stone";
            case 2 -> computerMove = "Paper";
            case 3 -> computerMove = "Scissor";
        }

        System.out.println("\nYour choice: " + userMove);
        System.out.println("Computer choice: " + computerMove);

        // Game result logic
        if (userMove.equals(computerMove)) {
            System.out.println("Result: DRAW");
        }
        else if (
                (userMove.equals("Stone") && computerMove.equals("Scissor")) ||
                (userMove.equals("Paper") && computerMove.equals("Stone")) ||
                (userMove.equals("Scissor") && computerMove.equals("Paper"))
        ) {
            System.out.println("Result: YOU WIN!");
        }
        else {
            System.out.println("Result: YOU LOSE!");
        }

        sc.close();
    }
}

