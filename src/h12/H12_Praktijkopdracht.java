package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_Praktijkopdracht extends Applet {

    Button klik = new Button("Ok");
    TextField telefoon = new TextField("Tel");
    TextField name = new TextField("Name");
    String contact[] = new String[10];
    int currentIndex = 0;

    public void init() {

        add(klik);
        add(telefoon);
        add(name);
        klik.addActionListener(new contactListener());

    }
    public void paint(Graphics g) {

        name.setSize(150, 20);
        name.setLocation(210, 20);
        telefoon.setSize(100, 20);
        telefoon.setLocation(100, 20);
        klik.setSize(40, 20);
        klik.setLocation(50, 20);

        g.drawString("List", 100, 50);

        if (currentIndex == 10) {
            for (int i = 0; i < contact.length; i++) {
                g.drawString(contact[i], 100, 70 + (i * 20));
            }
        }
    }

    class contactListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (currentIndex < 10) {
                contact[currentIndex++] = name.getText() + " - " + telefoon.getText();
            }

            name.setText("Name");
            telefoon.setText("Tel");

            repaint();

        }
    }
}
