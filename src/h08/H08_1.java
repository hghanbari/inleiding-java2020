package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08_1 extends Applet {

    Button Ok;
    Button Clean;
    TextField myWord;
    Label Stiker;

    public void init() {

        setSize(1000, 600);

        Stiker = new Label();
        add(Stiker);

        myWord = new TextField();
        add(myWord);

        Ok = new Button("Okay");
        add(Ok);

        Clean = new Button("Cancel");
        add(Clean);


    }


    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        Stiker.setLocation(100,100);
        Stiker.setSize(200,20);

        myWord.setLocation(20, 60);
        myWord.setSize(150, 20);

        Ok.setLocation(20, 20);
        Ok.setSize(50, 20);
        Ok.setBackground(Color.GREEN);
        Ok.addActionListener(new textLstener());

        Clean.setLocation(80, 20);
        Clean.setSize(80, 20);
        Clean.setBackground(Color.RED);
        Clean.addActionListener(new CleanLstener());
    }

    class textLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String myMessage = myWord.getText();
            Stiker.setText(myMessage);
            Clean.invalidate();

        }
    }
    class CleanLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            myWord.setText("");
            Stiker.setText("");
        }
    }

}
