package h04;

import javax.swing.*;
import java.awt.*;

public class Home extends JApplet {


    public void init() {
        this.setSize(800, 600);
    }

    public void paint(Graphics g) {
        this.drawHouse(g);
        this.drawRoof(g);
        this.drawDoor(g);
        this.drawWindow(g);
    }

    public void drawHouse(Graphics g) {
        g.drawRect(100, 200, 300, 300);
    }

    public void drawRoof(Graphics g) {
        g.drawLine(100, 200, 250, 100);
        g.drawLine(250, 100, 400, 200);
    }

    public void drawDoor(Graphics g) {
        g.drawRect(280, 350, 80, 150);
        g.drawOval(290,420,10,10);
    }

    public void drawWindow(Graphics g) {
        g.drawRect(150, 250, 100, 100);
        g.drawLine(200, 250, 200, 350);
        g.drawLine(150, 300, 250, 300);
    }
}
