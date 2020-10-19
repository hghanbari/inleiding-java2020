package h05;

import javax.swing.*;
import java.awt.*;

public class WeightWithVariables extends JApplet {

    int weightJeroen = 70;
    int weightValerie = 100;
    int weightHans = 10;

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
        int w = (weightHans * 200) / 100;
        g.fillRect(100, 500 - w, 50, w);
        g.setColor(Color.orange);
        w = (weightJeroen * 200) / 100;
        g.fillRect(200, 500 - w, 50, w);
        g.setColor(Color.blue);
        w = (weightValerie * 200) / 100;
        g.fillRect(300, 500 - w, 50, w);
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
