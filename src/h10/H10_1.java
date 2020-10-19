package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_1 extends Applet {

    int number1;
    int number2;

    Button comparison;
    TextField num1;
    TextField num2;
    Label bignum;

    public void init() {

        setSize(500,500);

        num1 = new TextField();
        add(num1);

        num2 = new TextField();
        add(num2);

        comparison = new  Button("Klik ");
        add(comparison);

        bignum = new Label();
        add(bignum);

    }

    public void paint(Graphics g) {

        num1.setLocation(40,20);
        num1.setSize(50,20);
        num1.addActionListener(new controListener());

        num2.setLocation(40,60);
        num2.setSize(50,20);
        num2.addActionListener(new controListener());


        comparison.setLocation(40,140);
        comparison.setSize(50,20);
        comparison.setBackground(Color.orange);
        comparison.addActionListener(new controListener());

        bignum.setLocation(100,50);
        bignum.setSize(200,20);


    }
    class controListener implements ActionListener{

        String n1;
        String n2;
        String test;

        public void actionPerformed(ActionEvent e) {

            n1 = num1.getText();
            number1 = Integer.parseInt(n1);

            n2 = num2.getText();
            number2 = Integer.parseInt(n2);

            if(number1 > number2) {
                test = ""+ number1;
            }
            else{
                test = ""+number2;
            }

            bignum.setText("Biggest = " + test);

            repaint();

        }
    }
}

