///////////////////////////////////////////////////////////////////////////////
// Addition.java
///////////////////////////////////////////////////////////////////////////////
//
// Asks nicely for two numbers and then adds them together.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: Addition.java 277 2007-09-14 03:35:17Z ziggythehamster $
//
import java.util.Scanner;

public class Addition {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int n1;
		int n2;
		int sum;
		
		System.out.print("Enter first integer: "); // prompt
		n1 = input.nextInt(); // get first #

		System.out.print("Enter second integer: "); // another prompt
		n2 = input.nextInt();
		
		sum = n1 + n2;
		
		System.out.printf("Sum is %d", sum);
	}
} 