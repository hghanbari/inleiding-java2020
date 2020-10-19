package h06;

import javax.swing.*;
import java.awt.*;

public class H06_1 extends JApplet {

    double  Geld= 113 / 4;

    public void init() {
        setSize(1000, 600);

    }



    public void paint(Graphics g) {
        g.drawString(" Ali = " + Geld,20,20);
        g.drawString(" Jan = " + Geld,20,40);
        g.drawString(" Hamid = " + Geld,20,60);
        g.drawString(" Jeannette = " + Geld,20,80);
    }

}
