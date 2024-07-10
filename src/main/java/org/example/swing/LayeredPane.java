package org.example.swing;

import javax.swing.*;
import java.awt.*;

public class LayeredPane {

    LayeredPane() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLocation(400, 400);
        layeredPane.setPreferredSize(new Dimension(200, 200));
        layeredPane.setVisible(true);

        JPanel panel1 = createColoredPanel(Color.RED, 100, 100, 200, 200);
        JPanel panel2 = createColoredPanel(Color.GREEN, 150, 150, 200, 200);
        JPanel panel3 = createColoredPanel(Color.BLUE, 200, 200, 200, 200);

        layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel2, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(panel3, JLayeredPane.MODAL_LAYER);

        frame.add(layeredPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LayeredPane();
    }

    private static JPanel createColoredPanel(Color color, int x, int y, int width, int height) {
        // Create a colored JPanel with specified color and position.
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setBounds(x, y, width, height);
        return panel;
    }
}
