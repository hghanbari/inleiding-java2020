package h11;

import javax.swing.*;
import java.awt.*;

public class H11_9 extends JApplet {
    int numberOfRow = 8;
    int squareWidth = 50;

    public void init() {
        setSize(820, 820);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < numberOfRow; i++) {
            drawRow(g, i, i * squareWidth, squareWidth);


        }
    }

    public void drawRow(Graphics g, int noOfRow, int y, int width) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < numberOfRow; i++) {
            if (noOfRow % 2 == 0) {
                if (i % 2 == 0) {
                    g.fillRect(i * width, y, width, width);
                }
            } else {
                if (i % 2 != 0) {
                    g.fillRect(i * width, y, width, width);
                }

            }
        }
    }
}

