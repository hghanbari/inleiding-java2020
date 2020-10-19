package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_2 extends Applet {


    Button card = new Button("Deel kaarten");
    boolean play = false;
    String originalCards[] = new String[52];
    String deck[] = new String[52];

    String numbers[] = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven",
            "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String shapes[] = {"Harten", "Ruiten", "Klaver", "Schoppen"};

    String[] player1 = new String[13];
    String[] player2 = new String[13];
    String[] player3 = new String[13];
    String[] player4 = new String[13];


    public void init() {
        setSize(1000, 800);

        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                deck[counter++] = shapes[i] + " " + numbers[j];
            }
        }

        originalCards = deck.clone();

        add(card);
        card.addActionListener(new cardListener());


    }

    public void paint(Graphics g) {

        if (play) {
            g.drawString("player1", 100, 50);
            for (int i = 0; i < player1.length; i++) {

                g.drawString(player1[i], 100, 70 + (i * 20));
            }

            g.drawString("player2", 300, 50);
            for (int i = 0; i < player2.length; i++) {

                g.drawString(player2[i], 300, 70 + (i * 20));
            }

            g.drawString("player3", 500, 50);

            for (int i = 0; i < player3.length; i++) {

                g.drawString(player3[i], 500, 70 + (i * 20));
            }

            g.drawString("player4", 700, 50);
            for (int i = 0; i < player4.length; i++) {

                g.drawString(player4[i], 700, 70 + (i * 20));
            }
        }
    }

    private void players() {

        for (int i = 0; i < 13; i++) {
            player1[i] = pickRandomCard();
        }

        for (int i = 0; i < 13; i++) {
            player2[i] = pickRandomCard();
        }

        for (int i = 0; i < 13; i++) {
            player3[i] = pickRandomCard();
        }

        for (int i = 0; i < 13; i++) {
            player4[i] = pickRandomCard();
        }

    }

    private String pickRandomCard() {

        int select = new Random().nextInt(deck.length);
        String card = deck[select];
        String[] helpList = new String[deck.length - 1];

        int counter = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != select) {
                helpList[counter++] = deck[i];
            }
        }

        deck = helpList;

        return card;
    }

    class cardListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            play = true;
            deck = originalCards.clone();
            players();

            repaint();
        }
    }
}


