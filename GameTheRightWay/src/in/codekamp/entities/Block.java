package in.codekamp.entities;

import in.codekamp.resources.Resources;

public class Block extends Entity {
    public Block(int x, int y) {
        super(x, y);
        this.xVel = -5;
        this.image = Resources.blockImage;
    }
}