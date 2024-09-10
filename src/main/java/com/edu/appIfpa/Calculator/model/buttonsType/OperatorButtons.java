package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class OperatorButtons {
    final private JButton[] funcButtons = new JButton[4];

    public OperatorButtons () {
        String[] SYMBOLS = {"+", "-", "x", "÷"};
        for (int i = 0; i < SYMBOLS.length; i++) {
            funcButtons[i] = new JButton(SYMBOLS[i]);
        }
    }

    public JButton[] getFuncButtons() {
        return funcButtons;
    }
}
