package codekamp;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);


        //add elements here
        JButton b1 = new JButton("Click me!");
        p1.add(b1);

        f1.setSize(500, 600);
        f1.setVisible(true);
    }
}