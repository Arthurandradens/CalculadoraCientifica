package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class ScientificButtons {
    final private JButton[] funcButtons = new JButton[11];

    public ScientificButtons() {
        String[] SYMBOLS = {"x²", "²√", "sin", "cos", "tan", "³√", "log", "%", "1/","abs","rd"};
        for (int i = 0; i < SYMBOLS.length; i++) {
            funcButtons[i] = new JButton(SYMBOLS[i]);
        }
    }

    public JButton[] getFuncButtons() {
        return funcButtons;
    }
}
