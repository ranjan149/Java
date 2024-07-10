package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {

    ColorChooser(){
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);

        JLabel label = new JLabel("Choose a color");
        JButton button = new JButton("Choose");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser chooser = new JColorChooser();
                Color color = JColorChooser.showDialog(frame, "Choose a color", chooser.getColor());
                if (color != null) {
                    label.setForeground(color);
                }
            }
        });
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}
