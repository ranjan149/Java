package org.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox {

    ComboBox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ComboBox");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        String[] characters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        JComboBox<String> comboBox = new JComboBox<>(characters);
        comboBox.setEditable(true);
        comboBox.insertItemAt("Z", 3);

        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println(comboBox.getSelectedItem());
                }
            }
        });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedItem().equals("A")){
                    System.out.println("I am A");
                }
            }
        });
        frame.add(comboBox);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
