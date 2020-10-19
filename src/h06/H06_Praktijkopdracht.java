package h06;

import javax.swing.*;
import java.awt.*;

public class H06_Praktijkopdracht extends JApplet {

    // Noun
    double a = 5.9;
    double b = 6.3;
    double c = 6.3;

    // Algorithm

    double averageResult = (int) ((a + b + c) / 3);
    //double averageResult =  (a + b + c)/3;

    public void init() {
        setSize(1000, 600);

    }

    public void paint(Graphics g) {

        g.drawString(" Average Result = " + averageResult, 20, 80);
        //g.drawString(" Average Result = " + java.lang.Math.round(averageResult), 20, 80);
    }
}
