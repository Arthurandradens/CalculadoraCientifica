package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class NumberButtons {
    final private JButton[] funcButtons = new JButton[12];
    public NumberButtons() {
        String[] SYMBOLS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", ".","0","="};
        for (int i = 0; i < SYMBOLS.length; i++)
            funcButtons[i] = new JButton(SYMBOLS[i]);
    }
    public JButton[] getNumButtons() {
        return funcButtons;
    }
}
