///////////////////////////////////////////////////////////////////////////////
// ShapesTest.java
///////////////////////////////////////////////////////////////////////////////
//
// Draws the Shapes object within a JFrame
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: ShapesTest.java 172 2006-10-25 17:53:13Z ziggythehamster $
//

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main(String args[]) {
		// figure out what they want to do
		String input = JOptionPane.showInputDialog(
			"Enter 1 to draw rectangles\n" +
			"Enter 2 to draw ovals");
		int choice = Integer.parseInt(input);
		
		// create panel
		Shapes panel = new Shapes(choice);
		
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300,300);
		app.setVisible(true);
	}
}