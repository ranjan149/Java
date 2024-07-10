package org.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sliders {

    Sliders(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sliders");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JSlider slider = new JSlider();
        slider.setPreferredSize(new Dimension(300, 300));
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(2);
        slider.setOrientation(SwingConstants.VERTICAL);

        JLabel label = new JLabel();

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Slider Value: " + slider.getValue());
            }
        });

        frame.add(slider);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sliders();
    }
}
