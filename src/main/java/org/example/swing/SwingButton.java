package org.example.swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButton implements ActionListener {

    JTextArea textArea;

    SwingButton() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Button");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me");
        button.setPreferredSize(new Dimension(100, 50));

        ImageIcon icon = new ImageIcon("src/main/resources/229-westerlund-21.jpg");
        button.setIcon(icon);
        button.setText("Click me");
        textArea = new JTextArea();
        textArea.setVisible(true);
        textArea.setPreferredSize(new Dimension(100, 100));
        textArea.setBackground(Color.GRAY);
        button.addActionListener(this);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textArea.setText("Click Me!!");
//                textArea.setEditable(false);
//            }
//        });

        frame.add(button);
        frame.add(textArea);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setText("Click Me!!");
        textArea.setEditable(false);
    }
}
