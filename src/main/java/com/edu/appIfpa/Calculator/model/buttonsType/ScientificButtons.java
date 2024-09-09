package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class ScientificButtons {
    final private JButton[] funcButtons = new JButton[9];

    public ScientificButtons() {
        String[] SYMBOLS = {"pow", "sqrt", "sin", "cos", "tan", "cbrt", "log", "%", "1/"};
        for (int i = 0; i < SYMBOLS.length; i++) {
            funcButtons[i] = new JButton(SYMBOLS[i]);
        }
    }

    public JButton[] getFuncButtons() {
        return funcButtons;
    }
}
