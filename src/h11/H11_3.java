package h11;

import javax.swing.*;
import java.awt.*;

public class H11_3 extends JApplet {

    int a = 0;
    int b = 1;
    int i = 2;
    int c ;

    public void init() {
        setSize(800, 800);
    }


    public void paint(Graphics g) {

          while (i<20){
                c=a+b;
                a=b;
                b=c;
                i++;
              System.out.println(c);
            }

        }
    }




