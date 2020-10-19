package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08_Praktijkopdracht extends Applet {

    boolean h = false;
    Button sum = new Button("+");
    Button minus = new Button("-");
    Button times = new Button("*");
    Button divided = new Button("/");
    TextField num1 = new TextField();
    TextField num2 = new TextField();
    Label equals = new  Label();

    public void init() {

        setSize(500,500);

        add(num1);
        add(num2);
        add(equals);
        add(sum);
        sum.addActionListener(new sumListener());
        add(minus);
        minus.addActionListener(new minusListener());
        add(times);
        times.addActionListener(new timesListener());
        add(divided);
        divided.addActionListener(new dividedlsListener());

    }



    public void paint (Graphics g) {

        num1.setLocation(20,20);
        num1.setSize(80,20);
        num2.setLocation(110,20);
        num2.setSize(80,20);
        equals.setLocation(40,80);
        equals.setSize(80,20);


    }

    class sumListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            h = true;
            String text1 = num1.getText();
            double number1 = Double.parseDouble(text1);
            String text2 = num2.getText();
            double number2 = Double.parseDouble(text2);
            double total = number1 + number2;
            equals.setText(""+total);
            repaint();


        }
    }
    class minusListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            h = true;
            String text1 = num1.getText();
            double number1 = Double.parseDouble(text1);
            String text2 = num2.getText();
            double number2 = Double.parseDouble(text2);
            double total = number1 - number2;
            equals.setText(""+total);
            repaint();
        }
    }
    class timesListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            h = true;
            String text1 = num1.getText();
            double number1 = Double.parseDouble(text1);
            String text2 = num2.getText();
            double number2 = Double.parseDouble(text2);
            double total = number1 * number2;
            equals.setText(""+total);
            repaint();

        }
    }
    class dividedlsListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            h = true;
            String text1 = num1.getText();
            double number1 = Double.parseDouble(text1);
            String text2 = num2.getText();
            double number2 = Double.parseDouble(text2);
            double total = number1 / number2;
            equals.setText(""+total);
            repaint();

        }
    }
}
