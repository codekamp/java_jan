package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();

        frame.add(p);

        p.setPreferredSize(new Dimension(800, 450));
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        p.setFocusable(true);
        p.addKeyListener(new Demo());


        // TODO: why this is happening. onAttach.
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        Graphics g = p.getGraphics();
        BufferedImage grassImage;
        BufferedImage[] playerImages = new BufferedImage[8];
        try {
            URL u = Demo.class.getResource("../resources/grass.png");
            grassImage  = ImageIO.read(u);

            playerImages[0] = ImageIO.read(Demo.class.getResource("../resources/run_anim1.png"));
            playerImages[1] = ImageIO.read(Demo.class.getResource("../resources/run_anim2.png"));
            playerImages[2] = ImageIO.read(Demo.class.getResource("../resources/run_anim3.png"));
            playerImages[3] = ImageIO.read(Demo.class.getResource("../resources/run_anim4.png"));
            playerImages[4] = ImageIO.read(Demo.class.getResource("../resources/run_anim5.png"));
            playerImages[5] = playerImages[3];
            playerImages[6] = playerImages[2];
            playerImages[7] = playerImages[1];
        } catch (IOException e) {
            System.out.println("Please reinstall game");
            return;
        }

        int imageIndex = 0;
        p.requestFocus();
        while (true) {
            try {
                Thread.sleep(29);
            } catch (InterruptedException e) {
            }

            imageIndex++;
            imageIndex = imageIndex % 8;

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord += Demo.playerYVel;

            if(Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYAcc = 0;
                Demo.playerYVel = 0;
            }

//            if(imageIndex == 8) {
//                imageIndex = 0;
//            }

            g.clearRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImages[imageIndex], 364, Demo.playerYCord, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            Demo.playerYVel = -20;
            Demo.playerYAcc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}