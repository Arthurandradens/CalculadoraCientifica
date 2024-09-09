package com.edu.appIfpa.Calculator.model.buttonsType;

import javax.swing.*;

public class ControllerButtons {
    final private JButton[] funcButtons = new JButton[3];

    public ControllerButtons() {
        String[] SYMBOLS = {"DEL", "CLR", "§"};
        for (int i = 0; i < SYMBOLS.length; i++) {
            funcButtons[i] = new JButton(SYMBOLS[i]);
        }
    }

    public JButton[] getFuncButtons() {
        return funcButtons;
    }
}
