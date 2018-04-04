/***
****	Author:	Bill Gillespie
****	Note:	Drawing oval in forest green(35,142,35)
***/

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;



class Oval extends JPanel {
	private Color myColor;
	
	//setter always return void
	public void setColor(int red, int green, int blue){
		myColor = new Color(red, green, blue);
	}
	
	public Color getColor() {
		return myColor;
	}
	
	Oval() {
		// Default constructor w no parameters 
		// set color to red
		
		myColor = new Color(255, 0, 0);
	}
	
	Oval(int red, int green, int blue) {
		setColor(red, green, blue);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("Paint Compoment");
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		//Set color to forest green
		
		//g.setColor(new Color(35,142,35));
		g.setColor(myColor);
		g.fillOval(0,0,panelWidth,panelHeight);
		
		
		
	}
}

class OvalFrame extends JFrame{
	//create default constructor
	OvalFrame(){
		setBounds(200,200,400,800);
		setTitle("Draw");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build Oval
		Oval myOval = new Oval(0,255,255);
		Container contentPane = getContentPane();
		//System.out.print("test");
		contentPane.add(myOval);
		
	}
}
public class OvalDraw {

	public static void main(String[] args) {
		
		//using jFrame
		JFrame myFrame = new OvalFrame();
		
		
		
	}

}
