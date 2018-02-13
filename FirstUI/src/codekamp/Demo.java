package codekamp;

import javax.swing.*;
import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);

        //add elements here
        JTextField uField = new JTextField("Username");
        JTextField pField = new JTextField("Password");
        JButton b1 = new JButton("Login");
        JButton b2 = new JButton("Signup");

        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Elephant e1 = new Elephant();

        // Button will always call ActionPerformed method on it's actionLister whenever it is clicked
        // And it will pass whatever data is has to that method in the form of ActionEvent object
        b1.addActionListener(d1);
//        b2.addActionListener(c1);
        b2.addActionListener(e1);

        //actionPerformed()


        // in variable of interface Xyz you can store object of any Class which implements
        // Xyz interface
        Xyz pqr = new Elephant();

        p1.add(uField);
        p1.add(pField);
        p1.add(b1);
        p1.add(b2);


        b1.setForeground(Color.red);

        f1.setSize(500, 600);
        f1.setVisible(true);
    }

    public void login(int a, String b) {
        System.out.println("login button clicked");
    }

    public void addActionListner(Dog listner) {

    }
}