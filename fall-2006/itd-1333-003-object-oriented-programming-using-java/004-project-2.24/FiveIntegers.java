///////////////////////////////////////////////////////////////////////////////
// FiveIntegers.java
///////////////////////////////////////////////////////////////////////////////
//
// Reads five integers, determines the largest and smallest integers, and
// prints them out.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: FiveIntegers.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.util.Scanner;
import java.util.Arrays;

public class FiveIntegers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int[] numbers;
		numbers = new int[5];
		
		// ask for each number
		System.out.println("Please enter five numbers:");
		System.out.print("> ");
		numbers[0] = input.nextInt();
		System.out.print("> ");
		numbers[1] = input.nextInt();
		System.out.print("> ");
		numbers[2] = input.nextInt();
		System.out.print("> ");
		numbers[3] = input.nextInt();
		System.out.print("> ");
		numbers[4] = input.nextInt();
		
		// and now we do the magic sort!
		Arrays.sort(numbers);
		
		// And now we assume that [0] is the smallest and
		// [4] is the largest
		System.out.printf("The smallest number you entered: %d\n", numbers[0]);
		System.out.printf("The biggest number you entered:  %d\n", numbers[4]);
		
		// Apologies for the advanced code, but the
		// method involving loads of if statements
		// sucks. It'd require handling for a lot
		// of possibilities and the sort method is
		// simpler.
	}
}