package h04;

import javax.swing.*;
import java.awt.*;


public class Flag extends JApplet {

    public void init() {
        this.setSize(800, 600);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, 800, 200);
        g.setColor(Color.BLUE);
        g.fillRect(0, 400, 800, 200);

    }
}
