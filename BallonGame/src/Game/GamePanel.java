package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 05/07/16.
 */
public class GamePanel extends JPanel implements MouseListener, Runnable {

    private Image image;
    public static State currentState;


    public GamePanel() {
        super();

        this.setPreferredSize(new Dimension(600,700));
        this.addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        Resources.load();
        GamePanel.currentState = new MenuState();
        this.image = new BufferedImage(600, 700, BufferedImage.TYPE_INT_RGB);
        Thread thread = new Thread(this, "Game Thread");
        thread.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        GamePanel.currentState.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {


        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Graphics imageGraphics = this.image.getGraphics();
            Graphics panelGraphics = this.getGraphics();
            imageGraphics.clearRect(0,0,600,700);

            //draw things on image
            GamePanel.currentState.update(imageGraphics);

            imageGraphics.dispose();



            panelGraphics.drawImage(this.image, 0, 0, null);
            panelGraphics.dispose();

        }
    }
}
