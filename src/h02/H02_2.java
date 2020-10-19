package h02;

import java.applet.Applet;
import java.awt.*;

public class H02_2 extends Applet {

    public void init() {
        setBackground(Color.WHITE);
        setSize(50,60);
    }


    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString(" Hamid",50,60);
        g.setColor(Color.red);
        g.drawString(" Ghanbari",60,80);
    }

}
