package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {
    Button klik;

    double number1;
    double number2;
    double number3;

    String resultmathe;
    String resultphysics;
    String resultbiology;

    TextField math;
    TextField physics;
    TextField biology;

    Label mathResult;
    Label physicsResult;
    Label biologyResult;
    Label average;


    public void init() {
        setSize(500, 500);
        GridLayout gl = new GridLayout(4, 2);
        gl.setHgap(20);
        gl.setVgap(100);
        setLayout(gl);

        math = new TextField();
        add(math);
        math.addActionListener(new figuresListener());
        mathResult = new Label();
        add(mathResult);

        physics = new TextField();
        add(physics);
        physics.addActionListener(new figuresListener());
        physicsResult = new Label();
        add(physicsResult);


        biology = new TextField();
        add(biology);
        biology.addActionListener(new figuresListener());
        biologyResult = new Label();
        add(biologyResult);


        klik = new Button("OK");
        add(klik);
        klik.addActionListener(new figuresListener());

        average = new Label();
        add(average);
    }


    public void paint(Graphics g) {

        klik.setBackground(Color.RED);
        System.out.println();

    }

    class figuresListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            number1 = Double.parseDouble(math.getText());
            number2 = Double.parseDouble(physics.getText());
            number3 = Double.parseDouble(biology.getText());
            double averageGrade = (number1 + number2 + number3) / 3;
            average.setText(averageGrade + "");

            if (number1 >= 5) {
                resultmathe = "Voldoende";
            } else {
                resultmathe = "Onvoldoende";
            }
            mathResult.setText(resultmathe);

            if (number2 >= 5) {
                resultphysics = "Voldoende";
            } else {
                resultphysics = "Onvoldoende";
            }
            physicsResult.setText(resultphysics);

            if (number3 >= 5) {
                resultbiology = "Voldoende";
            } else {
                resultbiology = "Onvoldoende";
            }
            biologyResult.setText(resultbiology);


            repaint();
        }
    }
}
