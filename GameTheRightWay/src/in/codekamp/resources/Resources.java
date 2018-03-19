package in.codekamp.resources;

import in.codekamp.entities.Entity;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

public class Resources {
    public static Image grassImage;
    public static Image blockImage;
    public static Image playerImage1;
    public static Image playerImage2;
    public static Image playerImage3;
    public static Image playerImage4;
    public static Image playerImage5;
    public static Image playerJumpImage;
    public static AudioClip jumpAudio;
    public static AudioClip hitAudio;
    public static Color skyColor;


    public static void load() {
        skyColor = new Color(103, 194, 255);

        try {
            grassImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/grass.png"));
            blockImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/block.png"));
            playerImage1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/run_anim1.png"));
            playerImage2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/run_anim2.png"));
            playerImage3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/run_anim3.png"));
            playerImage4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/run_anim4.png"));
            playerImage5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/run_anim5.png"));
            playerJumpImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/codekamp/resources/images/jump.png"));
            jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/codekamp/resources/audios/onjump.wav"));
            hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/codekamp/resources/audios/hit.wav"));
        } catch (IOException e) {

        }
    }
}