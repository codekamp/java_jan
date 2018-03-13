package in.codekamp.main;

import in.codekamp.screen.Screen;
import in.codekamp.screen.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GamePanel extends JPanel implements KeyListener, Runnable, MouseListener {

    public Screen currentScreen;

    public GamePanel() {
        this.setPreferredSize(new Dimension(Game.GAME_WIDTH, Game.GAME_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.currentScreen = new WelcomeScreen(this);
        Thread gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }

            this.currentScreen.update();

            Graphics g = this.getGraphics();
            g.clearRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
            this.currentScreen.draw(g);
            g.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.currentScreen.onMousePress(e.getX(), e.getY());
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
}
