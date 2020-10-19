package h04;

import javax.swing.*;
import java.awt.*;

public class Weight extends JApplet {

    public void init() {
        setSize(800, 600);

    }

    public void paint(Graphics g) {
        this.drawGrid(g);
        this.drawBars(g);
        this.drawNames(g);
        this.measuringLines(g);

    }

    public void drawGrid(Graphics g) {
        g.drawLine(50, 280, 50, 500);
        g.drawLine(50, 500, 400, 500);
    }

    public void drawBars(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(100, 420, 50, 80);
        g.setColor(Color.orange);
        g.fillRect(200, 300, 50, 200);
        g.setColor(Color.blue);
        g.fillRect(300, 340, 50, 160);
    }

    public void drawNames(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 210, 520);
        g.drawString("Valerie", 305, 520);
        g.drawString("Hans", 105, 520);
        g.drawString("KG", 40, 270);
    }

    public void measuringLines(Graphics g) {
        g.drawString("100", 10, 305);
        g.drawString("80", 10, 345);
        g.drawString("60", 10, 385);
        g.drawString("40", 10, 425);
        g.drawString("20", 10, 465);

        g.drawLine(40, 300, 60, 300);
        g.drawLine(40, 340, 60, 340);
        g.drawLine(40, 380, 60, 380);
        g.drawLine(40, 420, 60, 420);
        g.drawLine(40, 460, 60, 460);
    }
}
