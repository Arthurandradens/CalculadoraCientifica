package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class NumberButtons {
    final private JButton[] numButtons = new JButton[10];
    public NumberButtons() {
        for (int i = 0; i < numButtons.length; i++)
            numButtons[i] = new JButton(String.valueOf(i));
    }
    public JButton[] getNumButtons() {
        return numButtons;
    }
}
