package com.edu.appIfpa.Calculator.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonsController {
    final private JButton delButton, clrButton, cientificaButton;

    public ButtonsController(ActionListener actionListener) {
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        cientificaButton = new JButton("§");

        JButton[] funcButtons = {delButton, clrButton, cientificaButton};

        for (JButton button : funcButtons) {
            button.addActionListener(actionListener);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setFocusable(false);
        }

        delButton.setBounds(50, 420, 145, 50);
        clrButton.setBounds(205, 420, 145, 50);
        cientificaButton.setBounds(20, 420, 145, 50);
    }
    public void addButtonsController(JFrame frame) {
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(cientificaButton);
    }
    public JButton getDelButton() {
        return delButton;
    }
    public JButton getClrButton() {
        return clrButton;
    }
    public JButton getCientificaButton() {
        return cientificaButton;
    }
}
