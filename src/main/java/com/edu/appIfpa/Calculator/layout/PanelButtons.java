package com.edu.appIfpa.Calculator.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelButtons {
    private final JPanel panel = new JPanel();
    private final ButtonsSimpleCalculator buttons;
    public PanelButtons(ActionListener actionListener) {
        buttons = new ButtonsSimpleCalculator(actionListener);
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(buttons.getNumButtons()[1]);
        panel.add(buttons.getNumButtons()[2]);
        panel.add(buttons.getNumButtons()[3]);
        panel.add(buttons.getAddButton());
        panel.add(buttons.getNumButtons()[4]);
        panel.add(buttons.getNumButtons()[5]);
        panel.add(buttons.getNumButtons()[6]);
        panel.add(buttons.getSubButton());
        panel.add(buttons.getNumButtons()[7]);
        panel.add(buttons.getNumButtons()[8]);
        panel.add(buttons.getNumButtons()[9]);
        panel.add(buttons.getMulButton());
        panel.add(buttons.getDecButton());
        panel.add(buttons.getNumButtons()[0]);
        panel.add(buttons.getEquButton());
        panel.add(buttons.getDivButton());


    }
    public ButtonsSimpleCalculator getButtons() {
        return buttons;
    }

    public void addPanel(JFrame frame) {
        frame.add(panel);
    }
}
