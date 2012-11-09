///////////////////////////////////////////////////////////////////////////////
// LegalFiveIntegers.java
///////////////////////////////////////////////////////////////////////////////
//
// Reads five integers, determines the largest and smallest integers, and
// prints them out.
//
// This version follows the "use only what you learned in this chapter" line.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: LegalFiveIntegers.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.util.Scanner;

public class LegalFiveIntegers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int small_num, big_num, tmp_num;
		
		// ask for each number
		System.out.println("Please enter five numbers:");
		System.out.print("> ");
		tmp_num = input.nextInt();
		// the first number will always be the smallest AND biggest
		small_num = tmp_num;
		big_num = tmp_num;
		
		System.out.print("> ");
		tmp_num = input.nextInt();
		// set big_num or small_num if needed
		if (tmp_num > big_num)			big_num = tmp_num;
		else if (tmp_num < small_num)	small_num = tmp_num;
		
		System.out.print("> ");
		tmp_num = input.nextInt();
		if (tmp_num > big_num)			big_num = tmp_num;
		else if (tmp_num < small_num)	small_num = tmp_num;		
		
		System.out.print("> ");
		tmp_num = input.nextInt();
		if (tmp_num > big_num)			big_num = tmp_num;
		else if (tmp_num < small_num)	small_num = tmp_num;
		
		System.out.print("> ");
		tmp_num = input.nextInt();
		if (tmp_num > big_num)			big_num = tmp_num;
		else if (tmp_num < small_num)	small_num = tmp_num;		
		
		// tell the user their magic numbers
		System.out.printf("The smallest number you entered: %d\n", small_num);
		System.out.printf("The biggest number you entered:  %d\n", big_num);
	}
}