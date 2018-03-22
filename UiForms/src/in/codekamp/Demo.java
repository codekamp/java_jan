package in.codekamp;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();

        MyLogin l = new MyLogin();

        f1.add(l.myPanel);


        //ADD UI ELEMENTS HERE

        f1.pack();
        f1.setVisible(true);

    }
}