package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by cerebro on 06/07/16.
 */
public abstract class State {

    public abstract void mousePressed(MouseEvent event);

    public abstract void update(Graphics graphics);
}
