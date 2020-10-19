package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_1 extends Applet {

    Color randomColor1;
    Color randomColor;
    Button card = new Button("Klik");

    boolean change = false;

    public void init() {

        setSize(800, 500);

        add(card);
        card.addActionListener(new cardListener());
        validate();
    }


    public void paint(Graphics g) {

        if (change) {
            g.setColor(randomColor);
            g.fillRect(200, 200, 200, 200);
            g.setColor(randomColor1);
            g.fillOval(250, 250, 100, 100);

        }

    }
    class cardListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            change = true;

            Random rand = new Random();
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            randomColor = new Color(red, green, blue);

            float red1 = rand.nextFloat();
            float green1 = rand.nextFloat() / 2f;
            float blue1 = rand.nextFloat() / 2f;
            randomColor1 = new Color(red1, green1, blue1);
//            randomColor1 = randomColor.darker();
            repaint();

        }
    }
}
