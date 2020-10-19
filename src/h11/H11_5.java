package h11;

import javax.swing.*;
import java.awt.*;

public class H11_5 extends JApplet {

    int numberOfSquares = 15;
    int baseSquareWidth = 800;

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        int squareWidth = baseSquareWidth / numberOfSquares;
        for (int i = 0; i < numberOfSquares; i++) {
            drawSquare(g, i * squareWidth, squareWidth);
        }

    }

    public void drawSquare(Graphics g, int x, int width) {
        g.drawRect(x, x, width, width);
    }
}
