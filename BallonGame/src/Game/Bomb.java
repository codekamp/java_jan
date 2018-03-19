package Game;

import Game.Element;
import Game.Resources;

/**
 * Created by cerebro on 05/07/16.
 */
public class Bomb extends Element {

    public Bomb(int x, int y) {
        super(x, y, 128, 128);

        this.image = Resources.bombImage;
        this.yVel = -10;
    }

    @Override
    public void update() {
        super.update();

        if (this.y < -128) {
            this.y = 800;
            this.hidden = false;
            this.x = Util.randomInt(0, 472);
        }
    }
}
