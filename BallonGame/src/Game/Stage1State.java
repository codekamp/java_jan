package Game;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 06/07/16.
 */
public class Stage1State extends State {

    private List<Element> elements;
    private int score = 0;

    public Stage1State() {
        super();
        this.elements = new ArrayList();
        this.elements.add(new Ballon(10, 800));
        this.elements.add(new Ballon(100, 600));
        this.elements.add(new Ballon(150, 900));
        this.elements.add(new Ballon(300, 1000));
        this.elements.add(new Ballon(400, 950));
        this.elements.add(new Ballon(20, 1200));
        this.elements.add(new Bomb(20, 1100));
        this.elements.add(new Bomb(450, 400));
        this.elements.add(new Bomb(300, 800));
    }

    @Override
    public void mousePressed(MouseEvent event) {
        for(int i = 0; i < this.elements.size(); i++) {
            Element element = this.elements.get(i);

            if(element.wasClicked(event.getX(), event.getY())) {

                element.hidden = true;
                Resources.burstAudio.play();

                if(element instanceof Ballon) {
                    this.score += 10;
                } else if(element instanceof Bomb) {
                    GamePanel.currentState = new GameOverState();
                }
            }
        }
    }

    @Override
    public void update(Graphics graphics) {

        if(Ballon.escapedCount >= 10) {
            GamePanel.currentState = new GameOverState();
            Ballon.escapedCount = 0;
        }

        if(this.score >= 100) {
            GamePanel.currentState = new Stage2State();
        }
        graphics.setColor(Color.cyan);
        graphics.fillRect(0,0,600,700);
        graphics.setColor(Color.red);

        graphics.drawString("Score: " + Integer.toString(this.score), 500, 20);

        for (int i = 0; i < this.elements.size(); i++) {
            Element element = this.elements.get(i);
            element.update();
            if(!element.hidden) {
                graphics.drawImage(element.image, element.x, element.y, null);
            }
        }
    }
}
