///////////////////////////////////////////////////////////////////////////////
// NumberGuessWithTries.java
///////////////////////////////////////////////////////////////////////////////
//
// Prompts user to guess numbers and stuff. Plays with their head. Then, it
// insults their intelligence by telling them how much they fail at life (okay,
// it just tells them how many times they've tried).
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: NumberGuessWithTries.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.util.Random;
import java.util.Scanner;

public class NumberGuessWithTries {
	private static int p_number = 0;
	private static int p_guesses = 0;
	
	public static void generateRandomNumber() {
		Random r = new Random();
		p_number = 1 + r.nextInt(1000);
	}
	
	public static int testGuess(int guess) {
		if (guess > p_number) {
			return 1; // too high
		} else if (guess == p_number) {
			return 0; // correct
		} else {
			return -1; // too low
		}
	}
	
	public static void main(String args[]) {
		boolean looping = true;
		int guess;
		// generate random number
		generateRandomNumber();
		
		System.out.printf("Guess a number between 1 and 1000.\n");
		// ask the user stuff
		while (looping) {
			Scanner input = new Scanner(System.in);
			System.out.printf("> ");
			guess = input.nextInt();
			p_guesses++; // increase number of guesses			
			if (testGuess(guess) == 1) {
				System.out.printf("Too high. Try again.\n");
			} else if (testGuess(guess) == 0) {
				System.out.printf("Congratulations. You guessed the number.\n");
				looping = false;
			} else {
				System.out.printf("Too low. Try again.\n");
			}
		}
		// they guessed the number.
		System.out.printf("You guessed the number in %d guesses.\n", p_guesses);
		if (p_guesses < 10) {
			System.out.printf("Either you know the secret or you got lucky!\n");
		} else if (p_guesses == 10) {
			System.out.printf("Aha! You know the secret!\n");
		} else {
			System.out.printf("You should be able to do better!\n");
		}
	}
}