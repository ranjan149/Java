package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest {

    KeyListenerTest() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu");
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello World");
        label.setBounds(0, 0, 200, 200);
        label.setForeground(Color.BLUE);
        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                switch (c) {
                    case 'a':
                        label.setLocation(label.getLocation().x + 10, label.getLocation().y + 10);
                        break;
                    case 's':
                        label.setLocation(label.getLocation().x - 10, label.getLocation().y + 10);
                        break;
                    case 'd':
                        label.setLocation(label.getLocation().x - 10, label.getLocation().y - 10);
                        break;
                    case 'w':
                        label.setLocation(label.getLocation().x - 10, label.getLocation().y + 10);
                        break;
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println(e.getKeyChar());
            }
        });
//        label.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                System.out.println(e.getKeyChar());
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyChar());
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                System.out.println(e.getKeyChar());
//            }
//        });

        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListenerTest();
    }
}
