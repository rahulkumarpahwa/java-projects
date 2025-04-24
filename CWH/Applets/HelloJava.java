package CWH.Applets;

import java.applet.*;
import java.awt.*;

public class HelloJava extends Applet {
    @Override
    public void paint(Graphics g) {
        // super.paint(g);
        g.drawString("Hello Java", 10, 100);
    }
}