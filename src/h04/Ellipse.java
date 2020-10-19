package h04;

import javax.swing.*;
import java.awt.*;

public class Ellipse extends JApplet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,500,500);
        g.setColor(Color.YELLOW);
        g.fillArc(10, 10, 200, 100, 0, 360);
    }
}
