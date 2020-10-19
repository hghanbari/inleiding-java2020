package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08_2 extends Applet {

    int counter;

    Button man;
    Button vrouwen;
    Button jongen;
    Button meisje;

    Label totalBord;
    Label manTeller;
    Label vrouwenTeller;
    Label jongenTeller;
    Label meisjeTeller;

    int manGeteld = 0;
    int vrouwenGeteld = 0;
    int jongenGeteld = 0;
    int meisjeGeteld = 0;

    public void init() {

        setSize(1000, 600);

        totalBord = new Label();
        add(totalBord);

        manTeller = new Label();
        add(manTeller);

        vrouwenTeller = new Label();
        add(vrouwenTeller);

        jongenTeller = new Label();
        add(jongenTeller);

        meisjeTeller = new Label();
        add(meisjeTeller);


        man = new Button("Man");
        add(man);
        man.addActionListener(new manLstener());

        vrouwen = new Button("Vrouwen");
        add(vrouwen);
        vrouwen.addActionListener(new vrouwenLstener());

        jongen = new Button("Jongen");
        add(jongen);
        jongen.addActionListener(new jongenLstener());

        meisje = new Button("Meisje");
        add(meisje);
        meisje.addActionListener(new meisjeLstener());
    }


    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        totalBord.setLocation(200, 80);
        totalBord.setSize(50, 20);

        manTeller.setLocation(100, 20);
        manTeller.setSize(50, 20);

        vrouwenTeller.setLocation(100, 60);
        vrouwenTeller.setSize(50, 20);

        jongenTeller.setLocation(100, 100);
        jongenTeller.setSize(50, 20);

        meisjeTeller.setLocation(100, 140);
        meisjeTeller.setSize(50, 20);

        man.setLocation(20, 20);
        man.setSize(70, 20);
        man.setBackground(Color.GREEN);


        vrouwen.setLocation(20, 60);
        vrouwen.setSize(70, 20);
        vrouwen.setBackground(Color.MAGENTA);


        jongen.setLocation(20, 100);
        jongen.setSize(70, 20);
        jongen.setBackground(Color.BLUE);


        meisje.setLocation(20, 140);
        meisje.setSize(70, 20);
        meisje.setBackground(Color.PINK);

    }

    public void totalperson() {
       int totalMensen = manGeteld + vrouwenGeteld + jongenGeteld + meisjeGeteld;
        totalBord.setText(totalMensen+"");

    }

    class manLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            manGeteld++;
            manTeller.setText(manGeteld + "");
            totalperson();

            repaint();
        }


    }
    class vrouwenLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            vrouwenGeteld++;
            vrouwenTeller.setText(vrouwenGeteld + "");
            totalperson();

            repaint();
        }


    }class jongenLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            jongenGeteld++;
            jongenTeller.setText(jongenGeteld + "");
            totalperson();

            repaint();
        }


    }class meisjeLstener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            meisjeGeteld++;
            meisjeTeller.setText(meisjeGeteld + "");
            totalperson();

            repaint();
        }


    }
}
