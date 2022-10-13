package com.ramsay.game;

// Import Java utilities
import java.util.Scanner;
import static java.lang.System.exit;

public class RockPaperScissorInfinite {
    public static void main (String[] args) {
        System.out.println("Welcome to Rock, Paper Scissors!");
        System.out.println("() [] <> () [] <> () [] <> () [] <>");
        System.out.println("--------------------------------------------");
        System.out.println(" ");
        Scanner userInput = new Scanner(System.in);
        String userResponse;

    // Do while loop to let the user keep playing
    do {
        // Generate a random number between 1 and 4 to determine the computer opponent's move.
        int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);

        // Prompt user for their move
        System.out.print("What is your move? To make a move, enter rock, paper or scissors. ");
        String userMove = userInput.nextLine();

        // Check if user's input is valid
        if (userMove.equalsIgnoreCase("rock")
                || userMove.equalsIgnoreCase("paper")
                || userMove.equalsIgnoreCase("scissors")) {
            System.out.println("...........");
        } else {
            System.out.println("That is not a valid move.");
            exit(0);
        }

        // Set the opponent's move based on the random RNG.
        String opponentMove;
        if (randomNumber == 1) {
            opponentMove = "rock";
        } else if (randomNumber == 2) {
            opponentMove = "scissors";
        } else {
            opponentMove = "paper";
        }

        // Print the result of the game
        if (userMove.equalsIgnoreCase(opponentMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("scissors"))
                || (userMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("rock"))
                || (userMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("paper"))) {
            System.out.println("************ You won! ************");
        } else {
            System.out.println("You lost!");
        }
        System.out.print("Do you wish to play again? Enter Yes or No");
        userResponse = userInput.nextLine();
    }
    while (userResponse.equalsIgnoreCase("Yes"));
    }
}
