package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeKampFrame extends JFrame implements ActionListener {

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

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);

        this.setSize(500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.changeColorButton) {
            if(this.label.getForeground() == Color.red) {
                this.label.setForeground(Color.green);
            } else {
                this.label.setForeground(Color.red);
            }
        } else {
            CodeKampFrame frame = new CodeKampFrame();

            frame.setVisible(true);
        }
    }
}