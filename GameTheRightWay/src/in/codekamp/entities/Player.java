package in.codekamp.entities;

import in.codekamp.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player extends Entity {

    private List<Image> allImages = new ArrayList<>();
    private int imageIndex = 0;
    private boolean inAir = false;

    public Player(int x, int y) {
        super(x, y);

        this.width = 72;
        this.height = 90;

        this.allImages.add(Resources.playerImage1);
        this.allImages.add(Resources.playerImage2);
        this.allImages.add(Resources.playerImage3);
        this.allImages.add(Resources.playerImage4);
        this.allImages.add(Resources.playerImage5);
        this.allImages.add(Resources.playerImage4);
        this.allImages.add(Resources.playerImage3);
        this.allImages.add(Resources.playerImage2);
    }

    public void update() {
        super.update();

        if(this.inAir) {
            this.image = Resources.playerJumpImage;
        } else {
            this.imageIndex++;
            this.imageIndex %= 8;
            this.image = this.allImages.get(this.imageIndex);
        }
    }

    public void jump() {
        Resources.jumpAudio.play();
        this.yVel = -18;
        this.yAcc = 1;
        this.inAir = true;
    }

    public void land() {
        this.yVel = 0;
        this.yAcc = 0;
        this.inAir = false;
    }
}