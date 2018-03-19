package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeKampFrame extends JFrame {

    private JButton changeColorButton;
    private JButton newWindowButton;
    private JLabel label;

    public CodeKampFrame() {
        super();

        JPanel p = new JPanel();
        this.add(p);
        this.changeColorButton = new JButton("Change Color");
        this.newWindowButton = new JButton("New Window");
        this.label = new JLabel("Hello World!");
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);
        p.add(this.label);

        ActionListener l1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(CodeKampFrame.this.label.getForeground() == Color.red) {
                    CodeKampFrame.this.label.setForeground(Color.green);
                } else {
                    CodeKampFrame.this.label.setForeground(Color.red);
                }
            }
        };

        this.changeColorButton.addActionListener(l1);
        this.newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeKampFrame frame = new CodeKampFrame();

                frame.setVisible(true);
            }
        });

        this.setSize(500, 500);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == this.changeColorButton) {
//            if(this.label.getForeground() == Color.red) {
//                this.label.setForeground(Color.green);
//            } else {
//                this.label.setForeground(Color.red);
//            }
//        } else {
//            CodeKampFrame frame = new CodeKampFrame();
//
//            frame.setVisible(true);
//        }
//    }

    // Android - SlideNerd YouTube
    // Angular - Udemy Angular 5 complete guide
    // iOS - iTunes Paul Hegarty stanford https://itunes.apple.com/us/course/developing-ios-11-apps-with-swift/id1309275316
    // Machine Learning - Andrew Ng Coursera https://www.deeplearning.ai/
    // (PHP) Laravel - Laracasts
    // Django, Django Rest Framework - Udemy courses, Official documentation (not soo good)
    // Node - EggHead.io (not soo good)
}