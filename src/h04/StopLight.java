package h04;

import javax.swing.*;
import java.awt.*;

public class StopLight extends JApplet {


    public void init() {
        this.setSize(800, 600);

    }


    public void paint(Graphics g) {
        g.fillRect(200,20,200,530);
        g.setColor(Color.RED);
        g.fillOval(225,30,150,150);
        g.setColor(Color.ORANGE);
        g.fillOval(225,200,150,150);
        g.setColor(Color.GREEN);
        g.fillOval(225,380,150,150);
    }
}

