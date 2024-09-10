package com.edu.appIfpa.Calculator.model;

import com.edu.appIfpa.Calculator.core.ButtonManager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PanelButtons {
    private final JPanel panel = new JPanel();
    private final JButton[] buttons;
    private final int[] gridLayout;
    private final ActionListener actionListeners;

    public PanelButtons(
            JButton[] buttons,
            int[] gridLayout,
            ActionListener actionListener
    ) {
        this.buttons = buttons;
        this.gridLayout = gridLayout;
        this.actionListeners = actionListener;
        createUIComponents();
    }
    private void configurePanel() {
        panel.setLayout(new GridLayout(gridLayout[0], gridLayout[1], gridLayout[2], gridLayout[3]));
    }
    private void createUIComponents() {
        configurePanel();
        for (JButton button : buttons) {
            new ButtonManager(button, actionListeners);
            panel.add(button);
        }
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public JPanel getPanel() {
        return panel;
    }
}
