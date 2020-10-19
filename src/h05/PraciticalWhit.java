package h05;

import javax.swing.*;
import java.awt.*;

public class PraciticalWhit extends JApplet {

    Color fillColor;
    Color lineColor;
    int width;
    int height;

    public void init() {
        fillColor = Color.MAGENTA;
        lineColor = Color.BLACK;
        width = 200;
        height = 100;
        setSize(800, 600);
    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100, 100, width, height);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, width, height, 30, 30);
        //teken gevulde rechthoek
        g.setColor(fillColor);
        g.fillRect(315, 100, width, height);
        //teken ovaal
        g.setColor(lineColor);
        g.drawOval(315, 100, width, height);
        //teken gevulde ovaal
        g.setColor(fillColor);
        g.fillOval(315, 225, width, height);
        //teken gevulde Line
        g.setColor(lineColor);
        g.drawLine(100,50, 300, 50);
        //teken gevulde ovaal
        g.drawOval(550, 100, width , height);
        g.setColor(fillColor);
        g.fillArc(550, 100, width, height, 0, 45);
        //teken gevulde cirkel
        g.setColor(lineColor);
        g.drawOval(600, 230, 100, height);
    }
}
