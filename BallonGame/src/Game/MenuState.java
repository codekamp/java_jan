package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by cerebro on 06/07/16.
 */
public class MenuState extends State {
    @Override
    public void mousePressed(MouseEvent event) {
        if (event.getX() > 20 && event.getX() < 580 && event.getY() > 200 && event.getY() < 300) {
            GamePanel.currentState = new Stage1State();
        }
    }

    @Override
    public void update(Graphics graphics) {
        graphics.drawImage(Resources.menuImage, 0, 0, 600, 700, null);
    }
}
