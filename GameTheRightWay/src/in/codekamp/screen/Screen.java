package in.codekamp.screen;

import in.codekamp.main.GamePanel;

import java.awt.*;

abstract public class Screen {

    protected GamePanel gPanel;

    public Screen(GamePanel p) {
        super();
        this.gPanel = p;
    }

    abstract public void update();

    abstract public void draw(Graphics g);

    public void onMousePress(int xCord, int yCord) {

    }
}