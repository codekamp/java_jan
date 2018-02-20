package codekamp;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();

        frame.add(p);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setResizable(false);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        Graphics g = p.getGraphics();

        int xCord = 0;
        int yCord = 0;

        while (true) {
            try {
                Thread.sleep(29);
            } catch (InterruptedException e) {

            }
            xCord++;
            yCord++;
            g.clearRect(0, 0, 500, 500);
            g.setColor(Color.green);
            g.fillArc(xCord, yCord, 100, 100, 0, 360);
        }
    }
}