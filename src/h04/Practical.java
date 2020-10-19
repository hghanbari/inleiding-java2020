package h04;

import javax.swing.*;
import java.awt.*;

public class Practical extends JApplet {

    Color fill = Color.MAGENTA;
    Color draw = Color.BLACK;

    public void init() {

        setSize(1000, 600);
    }

    public void paint(Graphics g) {
        this.Name(g);
        this.fill(g);
        this.draw(g);

    }
        public void fill (Graphics g){
        g.setColor(fill);
        g.fillOval(310, 200, 280, 100);
        g.fillRect(310, 50, 280, 100);
        g.fillArc(600, 50, 280, 100, 0, 45);
        g.fillRoundRect(20, 200, 280, 100, 30, 30);
    }
        public void draw (Graphics g){
        g.setColor(draw);
        g.drawLine(20, 20, 300, 20);
        g.drawRect(20, 50, 280, 100);
        g.drawOval(310, 50, 280, 100);
        g.drawOval(600, 50, 280, 100);
        g.drawOval(700, 200, 100, 100);
    }
        public void Name (Graphics g){
        g.drawString("Lijn",140,40);
        g.drawString("Rechthoek",120,180);
        g.drawString("Afgerounde rechthoek",100,320);
        g.drawString("Gevulde rechthoek met ovaal",350,180);
        g.drawString("Gevulde ovaal",400,320);
        g.drawString("Taartpunt met ovaal eromheen",650,180);
        g.drawString("Clrkel",730,320);
    }
}

