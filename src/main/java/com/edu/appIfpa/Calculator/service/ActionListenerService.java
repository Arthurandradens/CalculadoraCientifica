package com.edu.appIfpa.Calculator.service;

import com.edu.appIfpa.Calculator.layout.Display;
import com.edu.appIfpa.Calculator.layout.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionListenerService {
    OperatorService operatorService = new OperatorService();
    private String operator;
    private double num1;
    public void actionPerformed(
            Display display,
            Panels panels,
            ActionEvent e) {

        for (JButton button: panels.getButtonsListManager().getOperatorButtons()) {
            if (e.getSource() == button) {
                    num1 = Double.parseDouble(display.getTextInDisplay());
                    operator = button.getText();
                    display.deleteTextInDisplay();
                    break;
            }
        }
        for (JButton button: panels.getButtonsListManager().getNumberButtons()) {
            if (e.getSource() == button){
                switch (button.getText()){
                    case ".":
                        display.addCharInDisplay(".");
                        break;
                    case "=":
                        double num2;
                        try {
                            num2 = Double.parseDouble(display.getTextInDisplay());
                        } catch (NumberFormatException error) {
                            num2 = 0.0;
                        }
                        double result = operatorService.selectionOperator(operator, num1, num2);
                        display.setTextInDisplay(result);
                        num1 = result;
                        break;
                        default:
                            display.addCharInDisplay(button.getText());
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
                        num1 = 0;
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
                    case "x²","²√","sin","cos","tan","³√","log","1/","abs","rd":
                        num1 = Double.parseDouble(display.getTextInDisplay());
                        operator = button.getText();
                        double num2;
                        try {
                            num2 = Double.parseDouble(display.getTextInDisplay());
                        } catch (NumberFormatException error) {
                            num2 = 0.0;
                        }
                        double result = operatorService.selectionOperator(operator, num1, num2);
                        display.setTextInDisplay(result);
                        num1 = result;
                        break;
                    case "%":
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

