package h06;

import javax.swing.*;
import java.awt.*;

public class H06_3 extends JApplet {

    int Result;

    public void init() {

        Result = 4 - 15;
    }

    public void paint(Graphics g) {
        g.drawString("Result : " + Result, 20, 20);
    }
}
