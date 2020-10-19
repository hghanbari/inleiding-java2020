package h11;

import javax.swing.*;
import java.awt.*;

public class H11_7 extends JApplet {

    int numberOfCircles = 50;
    int circleDiameter = 800;

    public void init() {
        setSize(820, 820);
    }

    public void paint(Graphics g) {
        int margin = circleDiameter / numberOfCircles;
        int m = 0;
        for (int i = 0; i < numberOfCircles; i++) {
            m = i * margin;
            drawCircle(g, m / 2, circleDiameter - m);
        }

    }

    public void drawCircle(Graphics g, int x, int width) {
        g.drawOval(x, x, width, width);
    }
}



