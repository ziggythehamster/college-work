///////////////////////////////////////////////////////////////////////////////
// DiceRoller.java
///////////////////////////////////////////////////////////////////////////////
//
// This calculates the probability of rolling a particular number using two
// dice over 36,000 tries.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

import java.util.Random;

public class DiceRoller {
	public static void main (String args[]) {
		int diceValue[] = new int[12];
		int die1 = 0;
		int die2 = 0;
		final int numRolls = 36000;
		final double numRollsF = 36000.0;
		Random r = new Random();
		
		System.out.printf("*** Rolling two dice 36,000 times...\n");
		
		// we treat index 0 as "1"
		// "1" doesn't happen with two dice, so it's always going to be 0.
		for (int i = 0; i < numRolls; i++) {
			die1 = r.nextInt(6) + 1;
			die2 = r.nextInt(6) + 1;
			diceValue[die1+die2-1]++;
		}
		
		System.out.printf("*** RESULTS ***\n");
		System.out.printf("#\tTimes Rolled\tPercentage Rolled\n");
		for (int i = 2; i < diceValue.length +1; i++) {
			double percentage = 0.0;
			percentage = (diceValue[i-1] / numRollsF) * 100.0;
			System.out.printf("%d\t%d\t\t%.2f%%\n", i, diceValue[i-1], percentage);
		}
	}
}