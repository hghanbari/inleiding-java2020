package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_3 extends Applet {

    boolean red = false;
    boolean gray = false;
    Button klikRed = new Button("Gray muur");
    Button klikGray = new Button("Red muur");
    int numberOfRow = 8;
    int squareWidthRed = 90;
    int squareHeightRed = 40;
    int number1fRow = 10;
    int squareWidthGray = 110;
    int squareHeightGray = 80;

    public void init() {

        setSize(820, 820);


        add(klikRed);
        klikRed.addActionListener(new changeListener());
        klikRed.setEnabled(true);
        klikRed.setActionCommand("disable");


        add(klikGray);
        klikGray.addActionListener(new changeListener());
        klikGray.setEnabled(false);
        klikGray.setActionCommand("enable");

    }

    public void paint(Graphics g) {
        for (int i = 0; i < numberOfRow; i++) {
            drawWallRed(g, i, i * squareHeightRed, squareWidthRed, squareHeightRed);
        }

        for (int i = 0; i < number1fRow; i++) {
            drawWallGray(g, i, i * squareHeightGray, squareWidthGray, squareHeightGray);
        }

    }

    public void drawWallGray(Graphics g, int noOfRow, int y, int width, int height) {
        if (gray) {
            g.setColor(Color.GRAY);
            for (int i = 0; i < number1fRow; i++) {
                if (noOfRow % 2 == 0) {
                    if (i % 2 == 0) {
                        g.fillRect(i * (width / 2), y, width - 10, height - 10);
                    }
                } else {
                    if (i % 2 != 0) {
                        g.fillRect(i * (width / 2), y, width - 10, height - 10);
                    }

                }
            }
        }
    }

    public void drawWallRed(Graphics g, int noOfRow, int y, int width, int height) {
        if (red) {
            g.setColor(Color.RED);
            for (int i = 0; i < numberOfRow; i++) {
                if (noOfRow % 2 == 0) {
                    if (i % 2 == 0) {
                        g.fillRect(i * (width / 2), y, width - 10, height - 10);
                    }
                } else {
                    if (i % 2 != 0) {
                        g.fillRect(i * (width / 2), y, width - 10, height - 10);
                    }

                }
            }
        }
    }

    class changeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if ("disable".equals(e.getActionCommand())) {
                gray = true;
                red = false;
                klikRed.setEnabled(false);
                klikGray.setEnabled(true);

            } else {
                red = true;
                gray = false;
                klikRed.setEnabled(true);
                klikGray.setEnabled(false);

            }
            repaint();

        }
    }

}