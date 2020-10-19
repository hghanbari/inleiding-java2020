package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_6 extends Applet {

    int number;
    int total;
    Button search = new Button("Klik");
    TextField num = new TextField();
    int arry[] = {5, 1, 5, 2, 6, 6, 4, 5, 5, 8, 2,5};

    public void init() {


        setSize(800, 500);


        search.addActionListener(new searchListener());
        add(search);

        num.addActionListener(new searchListener());
        add(num);

    }

    public void paint(Graphics g) {

        g.drawString("" + total, 20, 20);
    }

    class searchListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            total = 0;

            for (int i = 0; i < arry.length; i++) {
                number = Integer.parseInt(num.getText());
                if (arry[i] == number)
                    total++;


            }
            repaint();
        }
    }

}
