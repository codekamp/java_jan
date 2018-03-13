package in.codekamp.main;

import javax.swing.*;

public class Game {

    public static final int GAME_HEIGHT = 450;
    public static final int GAME_WIDTH = 800;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
