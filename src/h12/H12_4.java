package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_4 extends Applet {


    TextField num = new TextField();
    Button kilk = new Button("Ok");
    int ary[] = {20, 40, 60, 80, 100};
    int number;
    int find = -1;
    boolean paint = false;

    public void init() {

        setSize(800, 500);

        add(num);
        num.addActionListener(new searchListener());
        add(kilk);
        kilk.addActionListener(new searchListener());

    }

    public void paint(Graphics g) {
        if (paint) {
            if (find >= 0) {
                g.drawString("De num is gevonden. Index van the num is " + find, 20, 50);
            } else {
                g.drawString("De num is niet gevonden.", 20, 50);
            }
        }
    }

    class searchListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            number = Integer.parseInt(num.getText());
            paint = true;
            find = -1;
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == number) {
                    find = i;
                }
            }

            repaint();
        }
    }

}