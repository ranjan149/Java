package org.example.swing;

import javax.swing.*;

public class OptionPane {

    OptionPane() {
        JOptionPane.showConfirmDialog(null, "Confirm", "Confirmation", JOptionPane.DEFAULT_OPTION);
    }

    public static void main(String[] args) {

        //JOptionPane.showConfirmDialog(null, "Is it true");
        //JOptionPane.showMessageDialog(null, "Installed");
        //JOptionPane.showInputDialog(null, "What is your name?");
        //JOptionPane.showInternalConfirmDialog(null, "Internal");
        JOptionPane.showConfirmDialog(null, "Confirm", "Confirmation", JOptionPane.DEFAULT_OPTION);
    }
}
