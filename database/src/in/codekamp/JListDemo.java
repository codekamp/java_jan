package in.codekamp;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JListDemo {
    private JTextField todoField;
    public JPanel panel;
    private JButton submitButton;
    private JList myList;

    public JListDemo() {
        List<String> tasks = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();


        String[] todos = {"Call Mom.", "Complete Java Assignment.", "Bring Xyz"};
        this.myList.setListData(tasks.toArray());


        this.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] toBeDeleted = JListDemo.this.myList.getSelectedIndices();


            }
        });
    }




}