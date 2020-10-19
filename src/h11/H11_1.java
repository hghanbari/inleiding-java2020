package h11;

import javax.swing.*;
import java.awt.*;

public class H11_1 extends JApplet {

    int numberLine = 10;
    int baseLineX = 800;


    public void init() { setSize(800,800); }


    public void paint(Graphics g) {

        int squareLine = baseLineX / numberLine;

        for (int i = 0; i < numberLine ; i++) {
            drawLine(g, i * squareLine, squareLine );
        }
    }

    private void drawLine(Graphics g, int x1 , int x2) {g.drawLine(x1,x2,x1,x1);
    }
}

