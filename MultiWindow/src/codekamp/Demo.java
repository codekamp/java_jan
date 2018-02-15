package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo implements ActionListener {

    private JLabel l1;
    private JButton b1;
    private JButton b2;

    public static void main(String[] args) {
        Demo.createNewWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.b1) {
            if(this.l1.getForeground() == Color.red) {
                this.l1.setForeground(Color.green);
            } else {
                this.l1.setForeground(Color.red);
            }
        } else {
            Demo.createNewWindow();
        }
    }

    private static void createNewWindow() {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();

        f1.add(p1);
        Demo d1 = new Demo();
        d1.l1 = new JLabel("Hello world!");
        d1.b1 = new JButton("change color");
        d1.b2 = new JButton("new window");

        p1.add(d1.l1);
        p1.add(d1.b1);
        p1.add(d1.b2);


        d1.b1.addActionListener(d1);
        d1.b2.addActionListener(d1);


        f1.setSize(500, 600);
        f1.setVisible(true);
    }
}