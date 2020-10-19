package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_4 extends Applet {

    Button klik;
    TextField monthNum;
    TextField yearNum;
    Label sticker;
    String text = "";


    public void init() {

        klik = new Button("Klik");
        klik.addActionListener(new motheListener());
        add(klik);

        monthNum = new TextField();
        monthNum.addActionListener(new motheListener());
        add(monthNum);

        yearNum = new TextField();
        yearNum.addActionListener(new motheListener());
        add(yearNum);

        sticker = new Label();
        add(sticker);

    }

    public void paint(Graphics g) {
        monthNum.setLocation(20, 40);
        monthNum.setSize(40, 20);

        yearNum.setLocation(20, 70);
        yearNum.setSize(40, 20);

        klik.setLocation(20, 100);
        klik.setSize(40, 20);

        sticker.setLocation(20, 130);
        sticker.setSize(200, 100);
    }

    class motheListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            int monthNumber = Integer.parseInt(monthNum.getText());
            int year = Integer.parseInt(yearNum.getText());

            switch (monthNumber) {
                case 1:
                    text = "januari 31 dag ";
                    break;
                case 2:
                    if (year % 4 == 0) {
                        text = "februari 29 dag";
                    } else {
                        text = "februari 28 dag";
                    }
                    break;
                case 3:
                    text = "maart 31 dag";
                    break;
                case 4:
                    text = "april 30 dag ";
                    break;
                case 5:
                    text = "mei 31 dag";
                    break;
                case 6:
                    text = "juni 30 dag";
                    break;
                case 7:
                    text = "juli 31 dag";
                    break;
                case 8:
                    text = "augustus 31 dag";
                    break;
                case 9:
                    text = "september 30 dag";
                    break;
                case 10:
                    text = "oktober 31 dag";
                    break;
                case 11:
                    text = "november 30 dag";
                    break;
                case 12:
                    text = "december 31 dag";
                    break;
                default:
                    text = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }

            sticker.setText(text);
            repaint();
        }
    }


}
