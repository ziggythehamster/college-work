///////////////////////////////////////////////////////////////////////////////
// Shapes.java
///////////////////////////////////////////////////////////////////////////////
//
// Extends JPanel and provides drawing of various shapes in differing colors.
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: Shapes.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Shapes extends JPanel {
	private int p_shapeToDraw;
	
	public Shapes(int i) {
		p_shapeToDraw = i;
	}
	
	public void paintComponent(Graphics g) {
		Color myColor;
		
		super.paintComponent(g); // run JPanel's paintComponent
		
		for (int i = 0; i < 4; i++) {
			// compute color
			switch (i) {
				case 0:
					myColor = new Color(0,0,0);
					break;
				case 1:
					myColor = new Color(255,0,0);
					break;
				case 2:
					myColor = new Color(0,255,0);
					break;
				case 3:
					myColor = new Color(0,0,255);
					break;
				default:
					myColor = new Color(128,128,128);
					break;
			}
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