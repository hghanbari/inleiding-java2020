package h04;

import javax.swing.*;
import java.awt.*;

public class Dice extends JApplet {


    public void init() {
        this.setSize(800, 600);

    }


    public void paint(Graphics g) {
        g.drawRect(200,100,200,200);
        g.fillOval(250,150,40,40);
        g.fillOval(250,200,40,40);
        g.fillOval(300,150,40,40);
        g.fillOval(300,200,40,40);
    }
}

