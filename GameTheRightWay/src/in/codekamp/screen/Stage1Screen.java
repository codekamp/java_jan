package in.codekamp.screen;

import in.codekamp.main.GamePanel;

import java.awt.*;

public class Stage1Screen extends Screen {

    public Stage1Screen(GamePanel panel) {
        super(panel);
    }

    public void update() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("this is stage 1 screen", 10, 10);
    }
}