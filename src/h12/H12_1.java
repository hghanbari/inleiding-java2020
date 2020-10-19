package h12;

import java.applet.Applet;
import java.awt.*;


public class H12_1 extends Applet {
    double number[];
    double max;
    double average;

    public void init() {
        number = new double[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = 1 + i * 12;
            max += number[i];
        }
        average = max / number.length;
    }

    public void paint(Graphics g) {
        for (int i = 0; i < number.length; i++) {
            g.drawString("" + number[i], 50, 20 * i + 20);
        }
        g.drawString("" + average, 80, 20);
    }
}

