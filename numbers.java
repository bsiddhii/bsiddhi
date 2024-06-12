import java.util.Random;
import java.util.Scanner;

 class NumberGuessingGame {
    public static void main(String[] args) {
        int score = 0;
        int rounds = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        while (true) {
            rounds++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You didn't guess the number. It was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }
    }
}