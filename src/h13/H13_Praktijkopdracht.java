package h13;

import java.applet.Applet;
import java.awt.*;

public class H13_Praktijkopdracht extends Applet {


    public void init() {

        setSize(800, 500);

    }


    public void paint(Graphics g) {
        this.three(g);

    }
    public void three (Graphics g){

        g.setColor(new Color(153, 102, 0));
        for (int i = 10; i < 20; i++) {
            g.drawLine(200, 200, 800 * i / 60, 500);
        }
        g.setColor(Color.GREEN);
        for (int i = 1; i < 7; i++) {
            g.fillOval(50 * i, 180, 50, 100);
        }
        for (int i = 1; i < 5; i++) {
            g.fillOval(70*i,150,50,100);
        }
        for (int i = 1; i < 4; i++) {
            g.fillOval(90*i,100,50,100);
        }
        for (int i = 1; i < 3; i++) {
            g.fillOval(120*i,50,50,100);
        }
        g.fillOval(150,0,100,150);
    }
}
