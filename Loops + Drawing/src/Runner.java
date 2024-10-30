import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		 
 //top right
        
		int x1 = 800;
		int y1 = 0;
		int x2 = 800;
		int y2 = 600;
		int counter = 0;
		
		for (; counter < 150; counter++)
		{
			g2.drawLine(x1, y1, x2, y2 );
			x1 -= 24;
			y2 -= 20;
		}
	
		//top left
		
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 600;
		int counter2 = 0;
		
		for (; counter2 < 150; counter2++) {
			g2.drawLine(x3, y3, x4, y4);
			x3 += 25;
			y4 -= 20;
		}
		
		//bottom left
		int x5 = 0;
		int y5 = 600;
		int x6 = 0;
		int y6 = 0;
		int counter3 = 0;
		
		while (counter3 < 150) {
		    g2.drawLine(x5, y5, x6, y6);
		    x5 += 25;
		    y6 += 20;
		    counter3++;
		}

		
		//bottom right
		int x7 = 800;
		int y7 = 600;
		int x8 = 800;
		int y8 = 0;
		int counter4 = 0;
		
		while (counter4 < 150) {
			g2.drawLine(x7, y7, x8, y8);
			x7 -= 25;
			y8 += 20;
			counter4++;
		}
  
	
		
	       
	       
	    }
	        
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
