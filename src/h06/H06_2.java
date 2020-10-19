package h06;

import javax.swing.*;
import java.awt.*;

public class H06_2 extends JApplet {

    int hour, year, day;

    public void init() {
        hour = 60 * 60;
        day = hour * 24;
        year = day * 365;
        setSize(800, 600);
    }
    public void paint(Graphics g) {
        g.drawString("seconds in one hour: " + hour, 20,20);
        g.drawString("seconds in one day: " + day, 20,40);
        g.drawString("seconds in one yers: " + year, 20,60);
    }
}
