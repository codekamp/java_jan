package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo implements ActionListener {

    private static JTextField uField;
    private static JTextField pField;



    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);

        //add elements here
        Demo.uField = new JTextField("Username");

        Demo.pField = new JTextField("Password");
        JButton b1 = new JButton("Login");

        // Button will always call ActionPerformed method on it's actionLister whenever it is clicked
        // And it will pass whatever data is has to that method in the form of ActionEvent object
        b1.addActionListener(new Demo());


        // in variable of interface Xyz you can store object of any Class which implements
        // Xyz interface

        p1.add(Demo.uField);
        p1.add(Demo.pField);
        p1.add(b1);

        f1.setSize(500, 600);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = Demo.uField.getText();
        String password = Demo.pField.getText();
        System.out.println("Login Button Clicked");
        System.out.println("Username is " + username);
        System.out.println("Password is " + password);
    }
}