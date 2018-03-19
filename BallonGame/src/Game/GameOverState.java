package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by cerebro on 06/07/16.
 */
public class GameOverState extends State {
    @Override
    public void mousePressed(MouseEvent event) {
        GamePanel.currentState = new MenuState();
    }

    @Override
    public void update(Graphics graphics) {
        graphics.drawImage(Resources.gameOverImage, 0, 0, 600, 700, null);
    }
}
