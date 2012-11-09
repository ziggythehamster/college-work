///////////////////////////////////////////////////////////////////////////////
// Bullseye.java
///////////////////////////////////////////////////////////////////////////////
//
// Extends JPanel and provides drawing of a bullseye in random colors.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: Shapes.java 172 2006-10-25 17:53:13Z ziggythehamster $
//

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;

public class Bullseye extends JPanel {
	private Color color1;
	private Color color2;
	
	public Bullseye() {
		Random r = new Random();
		// color 1
		int r1 = 0;
		int g1 = 0;
		int b1 = 0;
		// color 2
		int r2 = 0;
		int g2 = 0;
		int b2 = 0;		
		// color 1
		r1 = r.nextInt(255);
		g1 = r.nextInt(255);
		b1 = r.nextInt(255);
		// color 2
		r2 = r.nextInt(255);
		g2 = r.nextInt(255);
		b2 = r.nextInt(255);
		// set colors
		color1 = new Color(r1, g1, b1);
		color2 = new Color(r2, g2, b2);
	}
	
	public void paintComponent(Graphics g) {
		boolean evenCircle = false;
		super.paintComponent(g); // run JPanel's paintComponent
		
		for (int i = 0; i < 4; i++) {
			// set the color
			switch (p_shapeToDraw) {
				case 1:
					// rectangles
					g.setColor(myColor);
					g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;
				case 2:
					// ovals
					g.setColor(myColor);
					g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;
			}
		}
	}
}