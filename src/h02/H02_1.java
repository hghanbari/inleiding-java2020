package h02;

import java.applet.Applet;
import java.awt.*;

public class H02_1 extends Applet {

    public void init() {
     setBackground(Color.yellow);
    }
       public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Hallo Hamid",50,60);

    }
}

