package h13;

import java.applet.Applet;
import java.awt.*;

public class H13_Praktijkopdracht_2 extends Applet {


    public void init() {
        setSize(1000, 1200);
    }

    public void paint(Graphics g) {

        this.tree1(g);
        this.tree2(g);
        this.tree3(g);
        this.tree4(g);
        this.tree5(g);
    }

    public void tree1(Graphics g) {

        g.setColor(new Color(153, 102, 0));
        g.fillRect(200, 150, 50, 300);
        g.setColor(Color.GREEN);
        g.fillOval(100, 0, 250, 300);
    }

    public void tree2(Graphics g) {

        g.setColor(new Color(153, 102, 0));
        g.fillRect(450, 150, 50, 300);
        g.setColor(Color.GREEN);
        g.fillOval(350, 0, 250, 300);
    }

    public void tree3(Graphics g) {

        g.setColor(new Color(153, 102, 0));
        g.fillRect(700, 150, 50, 300);
        g.setColor(Color.GREEN);
        g.fillOval(600, 0, 250, 300);
    }

    public void tree4(Graphics g) {

        g.setColor(new Color(153, 102, 0));
        g.fillRect(300, 600, 50, 300);
        g.setColor(Color.GREEN);
        g.fillOval(200, 450, 250, 300);
    }

    public void tree5 (Graphics g) {

        g.setColor(new Color(153, 102, 0));
        g.fillRect(600, 600, 50, 300);
        g.setColor(Color.GREEN);
        g.fillOval(500, 450, 250, 300);
    }

}
