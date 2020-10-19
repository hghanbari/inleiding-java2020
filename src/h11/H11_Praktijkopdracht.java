package h11;

import javax.accessibility.AccessibleAction;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_Praktijkopdracht extends Applet {

    Button multiplication = new Button("Ok");
    TextField number = new TextField();
    int r;
    boolean h = false;
    int m;

    public void init() {

        setSize(800, 500);

        add(number);
        add(multiplication);
        multiplication.addActionListener(new multiplicationL());
    }


    public void paint(Graphics g) {

        number.setSize(50, 20);
        number.setLocation(50, 50);
        multiplication.setSize(40, 20);
        multiplication.setLocation(50, 20);

        if (h) {
            String n = number.getText();
            m = Integer.parseInt(n);

            for (int i = 0; i <= 10; i++) {
                g.drawString("=", 150, 20 * i);

            }
            for (int j = 0; j <= 10; j++) {
                g.drawString("" + m + " * " + j, 110, 20 * j);

            }

            for (int i = 0; i <= 10; i++) {
                r = m * i;
                g.drawString("" + r, 170, 20 * i);

            }
        }

    }

    class multiplicationL implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            h = true;

            repaint();
        }
    }
}

