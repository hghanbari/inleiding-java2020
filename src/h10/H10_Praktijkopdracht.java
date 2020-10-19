package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_Praktijkopdracht extends Applet {

    Button klik = new Button("Klik");
    TextField cijfer = new TextField();
    Label result = new Label();
    String number;
    boolean h = false;
    String r ;

    public void init() {

        setSize(500, 500);

        add(cijfer);
        add(result);
        add(klik);
        klik.addActionListener(new figuresListener());

    }


    public void paint(Graphics g) {

        cijfer.setSize(50,20);
        cijfer.setLocation(50,50);
        result.setSize(400,20);
        result.setLocation(100,20);
        klik.setSize(40,20);
        klik.setLocation(50,20);


    }

    class figuresListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            h = true;
            String num = cijfer.getText();
            double n = Double.parseDouble(num);


            if (n <= 3) {
               r = "slecht";
            }
            else if (n == 4) {
                r = "Onvoldoende";
            }
            else if (n == 5)
                r = "matig";
            else if (n <= 7) {
                r= "Voldoende";
            }
            else if (n <= 10) {
                r = "goed";
            }
            else if (n > 10){
                r = "verkeerd cijfer is ingevoerd.";
            }
            result.setText(r);

            repaint();
        }
    }
}


