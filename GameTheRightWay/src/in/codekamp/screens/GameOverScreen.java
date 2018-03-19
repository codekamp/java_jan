package in.codekamp.screens;

import in.codekamp.main.GamePanel;

import java.awt.*;

public class GameOverScreen extends Screen {


    public GameOverScreen(GamePanel panel) {
        super(panel);
    }

    public void update() {
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Game Over. Press any key to continue", 10, 10);
    }

    @Override
    public void onKeyPress(int keyCode) {
        this.gPanel.currentScreen = new Stage1Screen(this.gPanel);
    }
}