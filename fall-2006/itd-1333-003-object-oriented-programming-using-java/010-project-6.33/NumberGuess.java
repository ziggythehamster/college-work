///////////////////////////////////////////////////////////////////////////////
// NumberGuess.java
///////////////////////////////////////////////////////////////////////////////
//
// Prompts user to guess numbers and stuff. Plays with their head.
// Psychological abuse for the win.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: NumberGuess.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	private static int p_number = 0;
	
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
	}
}