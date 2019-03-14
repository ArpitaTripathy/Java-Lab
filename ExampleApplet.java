/*<applet code="First.class" width="300" height="300">  
</applet>*/
import java.applet.Applet;
import java.awt.Graphics;  

public class ExampleApplet extends Applet
{String text;


public void start()
{System.out.println("Starting of Applet");
}

public void stop()
{System.out.println("Stopping of Applet");
}

public void destroy()
{System.out.println("Exiting from Applet");
}

public void paint(Graphics g)
{System.out.println("Painting the Applet");

g.drawString(text,30,30);
showStatus("This is status box");
}
}