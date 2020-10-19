package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_5 extends Applet {
    TextField num = new TextField();
    Button kilk = new Button("Ok");
    int ary[] = {20, 40, 60, 80, 100};
    int number;
    boolean find = false;
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
            if (find) {
                g.drawString("De num is gevonden.", 20, 50);
            } else {
                g.drawString("De num is niet gevonden.", 20, 50);
            }
        }
    }

    class searchListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            number = Integer.parseInt(num.getText());
            paint = true;
            find = false;
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == number) {
                    find = true;
                    break;
                }
            }

            repaint();
        }
    }
}
