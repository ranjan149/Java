package org.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox {

    CheckBox(){
        JFrame frame = new JFrame("CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 20));

        checkBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(checkBox.isSelected());
            }
        });

        frame.add(checkBox);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
