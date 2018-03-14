package in.codekamp.screens;

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
        g.drawString("this is settings screens", 10, 10);
    }
}