package in.codekamp.screen;

import in.codekamp.main.GamePanel;

import java.awt.*;

public class SettingsScreen extends Screen {


    public SettingsScreen(GamePanel panel) {
        super(panel);
    }

    public void update() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawString("this is settings screen", 10, 10);
    }
}