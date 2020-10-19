package h14;

import java.net.URL;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14_Praktijkopdracht extends Applet {

    Button pley = new Button("Speel");
    TextField numPlay = new TextField();
    Label texe = new Label("Hoeveel smileys neem je (één, twee of drie)?");
    Label fult = new Label();

    private Image afbeeldingPlay;
    private Image afbeeldingYouLost;
    private Image afbeeldingComputerLost;
    private URL pad;
    boolean start = false;
    int count;
    int num;

    public void init() {

        setSize(800, 500);

        add(texe);
        add(pley);
        pley.addActionListener(new gemaListener());
        add(numPlay);
        add(fult);

        pad = H14_Praktijkopdracht.class.getResource("./resources/");
        afbeeldingPlay = getImage(pad, "Play.jpg");
        afbeeldingYouLost = getImage(pad, "You lost.jpg");
        afbeeldingComputerLost = getImage(pad, "Computer lost.jpg");

    }

    private void gameplyer(int num) {

        count =- num;

        int x = count / 4;
        int pattern = 4 * x + 1;

        if (count < pattern) {
            pattern = 4 * (x - 1) + 1;
        }

    }

    public void paint(Graphics g) {

        if(start) {
            fult.setSize(100, 20);
            if (count == 0) {
                g.drawImage(afbeeldingYouLost, 80, 60, 200, 200, this);
                g.drawString("You are lost", 80, 80);
            }else {
                for (int i = 1; i <= count; i++) {
                    g.drawImage(afbeeldingYouLost, 65 * i / 2, 60, 30, 30, this);
                }
            }
        }
    }

    class gemaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            start = true;
            num = Integer.parseInt(numPlay.getText());

            if (num <= 0 || num > 3) {
                fult.setText("Onjuiste invoer");
            }else {
              fult.setText("");
            }
            gameplyer(num);
            repaint();

        }
    }
}



