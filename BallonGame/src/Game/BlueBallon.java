package Game;

/**
 * Created by cerebro on 06/07/16.
 */
public class BlueBallon extends Ballon {

    public BlueBallon(int x, int y, int yVel) {
        super(x, y, yVel);

        this.image = Resources.blueBallonImage;
        this.value = 20;
    }
}


// https://www.jetbrains.com/