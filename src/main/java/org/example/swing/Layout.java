package org.example.swing;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    Layout(){
        setTitle("Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridLayout(40, 40));
        setLocationRelativeTo(null);

        JButton button1 = new JButton("Button 1");
        button1.setPreferredSize(new Dimension(100, 50));
        JButton button2 = new JButton("Button 2");
        button2.setPreferredSize(new Dimension(100, 50));
        JButton button3 = new JButton("Button 3");
        button3.setPreferredSize(new Dimension(100, 50));
        JButton button4 = new JButton("Button 4");
        button4.setPreferredSize(new Dimension(100, 50));

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
