package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class OperatorButtons {
    final private JButton[] funcButtons = new JButton[6];

    public OperatorButtons () {
        String[] SYMBOLS = {"+", "-", "*", "/", ".", "="};
        for (int i = 0; i < SYMBOLS.length; i++) {
            funcButtons[i] = new JButton(SYMBOLS[i]);
        }
    }

    public JButton[] getFuncButtons() {
        return funcButtons;
    }
}
