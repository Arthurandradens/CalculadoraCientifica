package com.edu.appIfpa.Calculator.core;

import com.edu.appIfpa.Calculator.model.buttonsType.ControllerButtons;
import com.edu.appIfpa.Calculator.model.buttonsType.NumberButtons;
import com.edu.appIfpa.Calculator.model.buttonsType.OperatorButtons;
import com.edu.appIfpa.Calculator.model.buttonsType.ScientificButtons;

import javax.swing.*;

public class ButtonsListManager {
    private final JButton[] numberButtons = new NumberButtons().getNumButtons();
    private final JButton[] controllerButtons = new ControllerButtons().getFuncButtons();
    private final JButton[] operatorButtons = new OperatorButtons().getFuncButtons();
    private final JButton[] scientificButtons = new ScientificButtons().getFuncButtons();

    public JButton[] getControllerButtons() {
        return controllerButtons;
    }
    public JButton[] getNumberButtons() {
        return numberButtons;
    }
    public JButton[] getOperatorButtons() {
        return operatorButtons;
    }
    public JButton[] getScientificButtons() {
        return scientificButtons;
    }
}
