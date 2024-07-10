package org.example.swing;

import org.example.collections.StackTest;
import org.example.inheritance.Vechicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

public class TestFrame extends JFrame {

    public TestFrame() {
        setTitle("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        setLayout(new FlowLayout());
        JTextArea textArea = new JTextArea();
        textArea.setVisible(true);
        textArea.setPreferredSize(new Dimension(70, 20));
        JLabel label = new JLabel("This is a test");
        label.setVisible(true);
        JButton b = new JButton("Button");
        b.setVisible(true);
        add(label);
        add(textArea);
        add(b);
    }

    public static void main(String[] args) {
        new TestFrame();
    }

    //anonoymous class
    //actionlistner
    //eventlistner
    //itemlistner

}
