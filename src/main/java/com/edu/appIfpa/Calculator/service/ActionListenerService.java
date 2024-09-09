package com.edu.appIfpa.Calculator.service;

import com.edu.appIfpa.Calculator.layout.Display;
import com.edu.appIfpa.Calculator.layout.Panels;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionListenerService {
    OperatorService operatorService = new OperatorService();
    private String operator;
    private double num1;
    public void actionPerformed(
            Display display,
            Panels panels,
            ActionEvent e) {

        for (JButton button: panels.getButtonsListManager().getNumberButtons()) {
            int i = Integer.parseInt(button.getText());
            if (e.getSource() == panels.getButtonsListManager().getNumberButtons()[i]) {
                display.addCharInDisplay(panels.getButtonsListManager().getNumberButtons()[i].getText());
                break;
            }
        }
        for (JButton button: panels.getButtonsListManager().getOperatorButtons()) {
            if (e.getSource() == button){
                switch (button.getText()){
                    case ".":
                        display.addCharInDisplay(".");
                        break;
                    case "+", "-", "*", "/":
                        num1 = Double.parseDouble(display.getTextInDisplay());
                        operator = button.getText();
                        display.deleteTextInDisplay();
                        break;
                    case "=":
                        double num2;
                        try {
                            num2 = Double.parseDouble(display.getTextInDisplay());
                        } catch (NumberFormatException error) {
                            num2 = 0.0;
                        }

                        display.removeSymbolSciInDisplay(operator);
                        double result = operatorService.selectionOperator(operator, num1, num2);
                        display.setTextInDisplay(String.valueOf(result));
                        num1 = result;
                        break;
                        default:
                            break;
                }
                break;
            }
        }
        for (JButton button: panels.getButtonsListManager().getControllerButtons()) {
            if (e.getSource() == button){
                switch (button.getText()){
                    case "DEL":
                        display.deleteCharInDisplay();
                        break;
                    case "CLR":
                        display.deleteTextInDisplay();
                        break;
                    case "§":
                        panels.setScientificActivated(!panels.isScientificActivated());
                        break;
                        default:
                            break;
                }
                break;
            }
        }
        for (JButton button: panels.getButtonsListManager().getScientificButtons()) {
            if (e.getSource() == button){
                switch (button.getText()){
                    case "sqrt","sin","cos","tan","cbrt","log","1/":
                        num1 = Double.parseDouble(display.getTextInDisplay());
                        operator = button.getText();
                        display.addSymbolSciInDisplay(button.getText());
                        break;
                    case "pow", "%":
                        num1 = Double.parseDouble(display.getTextInDisplay());
                        operator = button.getText();
                        display.deleteTextInDisplay();
                        break;
                        default:
                            break;
                }
            }
        }
    }
}

