package in.codekamp.screens;

import in.codekamp.entities.Block;
import in.codekamp.entities.Entity;
import in.codekamp.entities.Player;
import in.codekamp.main.Game;
import in.codekamp.main.GamePanel;
import in.codekamp.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class Stage1Screen extends Screen {

    private static final int GROUND_Y_CORD = 315;

    private java.util.List<Block> blocks = new ArrayList<>();
    private Player player;

    public Stage1Screen(GamePanel panel) {
        super(panel);

        this.blocks.add(new Block(900, 355));
        this.blocks.add(new Block(1100, 355));
        this.blocks.add(new Block(1300, 355));
        this.blocks.add(new Block(1500, 355));
        this.blocks.add(new Block(1700, 355));

        this.player = new Player(400, GROUND_Y_CORD);

        this.entities.addAll(this.blocks);
        this.entities.add(this.player);
    }

    @Override
    public void update() {
        super.update();

        for (Entity e: entities) {
            if(e.x < 20) {
                e.x = 980;
            }
        }

        if(this.player.y >= GROUND_Y_CORD && this.player.yVel != 0) {
            this.player.y = GROUND_Y_CORD;
            this.player.land();
        }
    }

    public void draw(Graphics g) {
        g.drawImage(Resources.grassImage, 0, Game.GAME_HEIGHT - 45, null);
        super.draw(g);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE && this.player.y == GROUND_Y_CORD) {
            this.player.jump();
        }
    }
}