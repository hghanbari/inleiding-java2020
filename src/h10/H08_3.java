package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08_3 extends Applet {

    Button klik;
    TextField monthnum;
    Label stiker;
    String num, text;
    int monthname;

    public void init() {

        klik = new Button("Klik");
        klik.addActionListener( new motheListener() );
        add(klik);


        monthnum = new TextField();
        monthnum.addActionListener( new motheListener() );
        add(monthnum);

        text = "";
        stiker = new Label();
        add(stiker);

    }

    public void paint(Graphics g) {

        monthnum.setLocation(20,40);
        monthnum.setSize(40,20);

        klik.setLocation(20,60);
        klik.setSize(40,20);

        stiker.setLocation(20,80);
        stiker.setSize(20,100);

        g.drawString(text, 80, 50);
    }

    class motheListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            num = monthnum.getText();
            monthname = Integer.parseInt( num);
            switch(monthname) {
                case 1:
                    text = "januari 31 dag ";
                    break;
                case 2:
                    text = "februari 29 dag";
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
            repaint();
        }
    }









}
