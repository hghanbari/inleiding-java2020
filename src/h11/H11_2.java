package h11;

import javax.swing.*;
import java.awt.*;

public class H11_2 extends JApplet {

    int number1 = 20;
    int number2 = 10;


    public void init() {
        setSize(800, 800);
    }


    public void paint(Graphics g) {

        int num = number1 - number2;

        for (int i = 0; i <= num; i++) {
            int score = i + number2;
            System.out.println(score);

        }
    }




}
