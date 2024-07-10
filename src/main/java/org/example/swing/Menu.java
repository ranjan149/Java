package org.example.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class Menu {

    Menu(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu");
        frame.setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenu viewMenu = new JMenu("View");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem exitItem = new JMenuItem("Exit");

        openItem.setMnemonic(KeyEvent.VK_E);


        fileMenu.add(openItem);
        fileMenu.add(newItem);
        fileMenu.add(exitItem);


        openItem.addActionListener(e -> new OptionPane());
        newItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int dialog = fileChooser.showDialog(frame, "Open");

                if(dialog == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    System.out.println(file.getAbsolutePath());
                }
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        menuBar.add(viewMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
