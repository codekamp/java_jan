package codekamp;

import com.sun.org.apache.bcel.internal.classfile.Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeKampFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private JLabel label;

    public CodeKampFrame sibling;

    public CodeKampFrame() {
        super();

        JPanel p = new JPanel();
        this.add(p);
        this.changeColorButton = new JButton("Change Color");
        this.label = new JLabel("Hello World!");
        p.add(this.changeColorButton);
        p.add(this.label);

        this.changeColorButton.addActionListener(this);

        this.setSize(500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.sibling.label.getForeground() == Color.red) {
            this.sibling.label.setForeground(Color.green);
        } else {
            this.sibling.label.setForeground(Color.red);
        }
    }

    public void setSibling(CodeKampFrame f) {
        this.sibling = f;
        f.sibling = this;
    }
}