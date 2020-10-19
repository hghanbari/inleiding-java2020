package h04;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Triangle extends JApplet {

    public void init() {


    }

    public void paint(Graphics g) {
        g.drawLine(200,20,100,200);
        g.drawLine(20,20,100,200);
        g.drawLine(20,20,200,20);

    }
}

