package applet;
import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("HelloWorld", 25, 50);
	}
}
