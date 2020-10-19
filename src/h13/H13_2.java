package h13;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class H13_2 extends Applet {

    int numberOfRow = 8;
    int squareWidth = 90;
    int squareHeight = 40;

    public void init() {
        setSize(820, 820);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < numberOfRow; i++) {
            drawRow(g, i, i * squareHeight, squareWidth, squareHeight);
        }
    }

    public void drawRow(Graphics g, int noOfRow, int y, int width, int height) {
        g.setColor(Color.RED);
        for (int i = 0; i < numberOfRow; i++) {
            if (noOfRow % 2 == 0) {
                if (i % 2 == 0) {
                    g.fillRect(i * (width / 2), y, width-10, height-10);
                }
            } else {
                if (i % 2 != 0) {
                    g.fillRect(i * (width / 2), y, width-10, height-10);
                }

            }
        }
    }
}



