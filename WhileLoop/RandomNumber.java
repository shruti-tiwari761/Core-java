package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        int userGuess;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }

        } while (userGuess != randomNumber);
	}
}
