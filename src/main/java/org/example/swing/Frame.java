package org.example.swing;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public Frame(){

        ImageIcon icon = new ImageIcon("src/main/resources/229-westerlund-21.jpg");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        frame.setLayout(new BorderLayout());
        JLabel label = new JLabel(icon);
        label.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(100, 150, 102));
        panel1.setPreferredSize(new Dimension(200, 200));
        panel1.add(label);
        panel1.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(200, 100, 175));
        panel2.setPreferredSize(new Dimension(200, 200));
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(200, 115, 100));
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(100, 128, 200));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Frame frame = new Frame();

    }
}
