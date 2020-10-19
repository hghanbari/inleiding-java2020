package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_3 extends Applet {

    TextField num[] = new TextField[5];
    int numbers[] = new int[5];
    Button klik = new Button("OK");

    public void init() {
        setSize(500, 500);

        setLayout(new FlowLayout());

        for (int i = 0; i < num.length; i++) {
            num[i] = new TextField();
            add(num[i]);
        }


        klik.addActionListener(new totalListener());
        add(klik);

        setVisible(true);

    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public void paint(Graphics g) {

    }

    class totalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < num.length ; i++) {
                numbers[i] = Integer.parseInt(num[i].getText());
            }


            bubbleSort(numbers);

            for (int i = 0; i < num.length ; i++) {
                num[i].setText(numbers[i] + "");
            }
            repaint();
        }
    }
}
