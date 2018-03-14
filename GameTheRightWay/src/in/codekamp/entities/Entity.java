package in.codekamp.entities;

import java.awt.*;

abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;
    public Image image;

    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void update() {
        this.x += this.xVel;
        this.y += this.yVel;
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
    }
}