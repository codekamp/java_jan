package in.codekamp.entities;

import in.codekamp.resources.Resources;

public class Block extends Entity {
    public Block(int x, int y) {
        super(x, y);
        this.height = 50;
        this.width = 20;
        this.xVel = -5;
        this.image = Resources.blockImage;
    }
}