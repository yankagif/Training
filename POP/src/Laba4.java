import java.applet.*;
	import java.awt.*;
public class Laba4 extends Applet{
	
	final Font f = new Font("Helvetica", Font.BOLD, 18);

	public void paint(Graphics g) { 
	Dimension d = this.size();
	g.setColor(Color.white);
	g.fillRect(0,0,d.width,d.height);
	g.setColor(Color.black);
	g.setFont(f);
	drawCenteredString("133006"
			+ "133007"
			+ "133008"
			+ "133009", d.width, d.height, g);
	g.drawRect(0,0,d.width-1,d.height-1);
	}

}
