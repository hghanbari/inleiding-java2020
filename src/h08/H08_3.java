package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08_3 extends Applet {

    Button Ok;
    TextField myWord;
    Label Stiker;
    double getal;

    public void init() {

        getal= 21;

        setSize(1000, 600);

        Stiker = new Label();
        add(Stiker);

        myWord = new TextField();
        add(myWord);

        Ok = new Button("Okay");
        add(Ok);
        Ok.addActionListener(new OKLstener());


    }


    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        g.drawString( "inclusief BTW % 21",20,120);

        Stiker.setLocation(140, 100);
        Stiker.setSize(200, 20);

        myWord.setLocation(20, 60);
        myWord.setSize(150, 20);

        Ok.setLocation(20, 20);
        Ok.setSize(50, 20);
        Ok.setBackground(Color.GREEN);

    }

    class OKLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            String myMessage = myWord.getText();
            getal = Double.parseDouble( myMessage);
            double btw = getal * 0.21;
            Stiker.setText("€ "+getal+btw);


            repaint();
        }
    }
}

