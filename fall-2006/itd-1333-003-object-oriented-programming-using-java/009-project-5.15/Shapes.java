///////////////////////////////////////////////////////////////////////////////
// Shapes.java
///////////////////////////////////////////////////////////////////////////////
//
// This does the funky asterisk thing
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id$
//

public class Shapes {
	public Shapes() {
		// EMPTY CONSTRUCTOR
	}
	public void printStars(int num) {
		for (int i = 0; i<num; i++) {
			System.out.print('*');
		}
	}
	public void printSpaces(int num) {
		for (int i = 0; i<num; i++) {
			System.out.print(' ');
		}
	}
	public void doShapeA() {
		System.out.printf("%s\n", "(a)");
		for (int i = 0; i < 10; i++) {
			this.printStars(i + 1);
			System.out.println();
		}
	}
	public void doShapeB() {
		System.out.printf("%s\n", "(b)");
		for (int j = 0; j < 10; j++) {
			this.printStars(10 - j);
			System.out.println();
		}
	}
	public void doShapeC() {
		System.out.printf("%s\n", "(c)");
		for (int k = 0; k < 10; k++) {
			this.printSpaces(k);
			this.printStars(10 - k);
			System.out.println();
		}
	}
	public void doShapeD() {
		System.out.printf("%s\n", "(d)");
		for (int l = 0; l < 10; l++) {
			this.printSpaces(10 - (l + 1));
			this.printStars(l + 1);
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Shapes s = new Shapes();
		s.doShapeA();
		s.doShapeB();
		s.doShapeC();
		s.doShapeD();
		System.out.printf("%s\n", "Done!");
	}
}