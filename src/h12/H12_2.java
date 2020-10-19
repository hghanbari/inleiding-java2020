package h12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {

    Button buttons[] = new Button[25];


    public void init() {

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);

    }

    public void paint(Graphics g) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
        }
    }
}