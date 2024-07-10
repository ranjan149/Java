package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener {

    MouseListener(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu");
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());


        JLabel label = new JLabel("Hello World");
        label.setBounds(0, 0, 200, 200);
        label.setForeground(Color.BLUE);
        label.setBackground(Color.GRAY);
        label.setPreferredSize(new Dimension(200, 200));

        label.addMouseListener(new java.awt.event.MouseListener (){

            @Override
            public void mouseClicked(MouseEvent e) {
                label.setForeground(Color.RED);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setForeground(Color.BLACK);
            }
        });
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseListener();
    }
}

