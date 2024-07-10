package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton {

    RadioButton(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RadioButton");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        JRadioButton radioButton1 = new JRadioButton("A");
        radioButton1.setFocusable(false);
        JRadioButton radioButton2 = new JRadioButton("B");
        radioButton2.setFocusable(false);
        JRadioButton radioButton3 = new JRadioButton("C");
        radioButton3.setFocusable(false);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        radioButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected Radio Button A");
            }
        });

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
}
