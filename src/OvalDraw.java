// Author:	Bill Gillespie
// Note:	Drawing oval in forest green(35,142,35)



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;



class Oval extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("Paint Compoment");
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		g.setColor(new Color(35,142,35));
		g.fillOval(0,0,panelWidth,panelHeight);
		
		//System.out.println("Paint Compoment");
		
		
	}
}

public class OvalDraw {

	public static void main(String[] args) {
		

		JFrame myFrame = new JFrame();
		myFrame.setBounds(200,200,400,800);
		myFrame.setTitle("Draw");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Oval myOval = new Oval();
		Container contentPane = myFrame.getContentPane();
		//System.out.print("test");
		contentPane.add(myOval);
		
		
		
		
	}

}
