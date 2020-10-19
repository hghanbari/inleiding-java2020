package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_2 extends Applet {

    Button comparison;

    TextField num1;
    TextField num2;
    TextField num3;

    Label bignum;

    public void init() {

        setSize(500, 500);

        num1 = new TextField();
        add(num1);

        num2 = new TextField();
        add(num2);

        num3 = new TextField();
        add(num3);

        comparison = new Button("Klik ");
        add(comparison);

        bignum = new Label();
        add(bignum);

    }

    public void paint(Graphics g) {

        num1.setLocation(40, 20);
        num1.setSize(50, 20);
        num1.addActionListener(new ControlListener());

        num2.setLocation(40, 60);
        num2.setSize(50, 20);
        num2.addActionListener(new ControlListener());

        num3.setLocation(40, 100);
        num3.setSize(50, 20);
        num3.addActionListener(new ControlListener());

        comparison.setLocation(40, 180);
        comparison.setSize(50, 20);
        comparison.setBackground(Color.orange);
        comparison.addActionListener(new ControlListener());

        bignum.setLocation(100, 50);
        bignum.setSize(200, 20);

    }

    class ControlListener implements ActionListener {
        int min;
        int number1;
        int number2;
        int number3;

        public void actionPerformed(ActionEvent e) {

            number1 = Integer.parseInt(num1.getText());
            number2 = Integer.parseInt(num2.getText());
            number3 = Integer.parseInt(num3.getText());

            min = number1;

            if (number2 < min) {
                min = number2;
            }

            if(number3 < min) {
                min = number3;
            }

            bignum.setText("Small =  " + min);
            repaint();
        }
    }


}
