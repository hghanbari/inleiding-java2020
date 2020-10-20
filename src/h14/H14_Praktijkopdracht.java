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
    boolean computer = false;
    boolean you = false;
    int count = 23;
    int num;
    double pc;
    int pcNumber;

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

        count -= num;
        System.out.println(count);
        if (count <= 0) {
            you = true;
            return;

        } else pc = Math.random();
        pcNumber = (int) (pc * 3 + 1);
        count -= pcNumber;

        if (count <= 0) {
            computer = true;
            return;
        }
    }


    public void paint(Graphics g) {


        fult.setSize(100, 20);
        System.out.println(count);
        for (int i = 1; i <= count; i++) {
            g.drawImage(afbeeldingPlay, 65 * i / 2, 60, 30, 30, this);

        }
        if (computer) {
            this.ComputerLost(g);
            return;
        }
        if (you) {
            this.YouLost(g);
            return;
        }

        if (start) {
            g.drawString("De computer heeft weggehaald : " + pcNumber, 230, 40);
        }
    }

    public void ComputerLost(Graphics g) {
        g.drawImage(afbeeldingComputerLost, 20-0, 50, 200, 200, this);
        g.drawString("Computer lost", 50, 50);
    }

    public void YouLost(Graphics g) {
        g.drawImage(afbeeldingYouLost, 80, 60, 200, 200, this);
        g.drawString("You are lost", 50, 50);
    }

    class gemaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            start=true;
            num = Integer.parseInt(numPlay.getText());

            if (num <= 0 || num > 3) {
                fult.setText("Onjuiste invoer");

            } else {
                fult.setText("");
                gameplyer(num);
            }

            repaint();

        }
    }
}



