package h11;

import javax.swing.*;
import java.awt.*;

public class H11_6 extends JApplet {

    int numberOfCircles = 5;
    int circleDiameter = 100;

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        int margin = 0;
        for (int i = 0; i < numberOfCircles; i++) {
            margin = i * 20;
            drawCircle(g, margin / 2 , circleDiameter - margin);
        }

    }

    public void drawCircle(Graphics g, int x, int width) {
        g.drawOval(x, x, width, width);
    }
}
