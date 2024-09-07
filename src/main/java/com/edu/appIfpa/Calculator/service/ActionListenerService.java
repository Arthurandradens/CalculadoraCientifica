package com.edu.appIfpa.Calculator.service;

import com.edu.appIfpa.Calculator.layout.ButtonsController;
import com.edu.appIfpa.Calculator.layout.ButtonsSimpleCalculator;
import com.edu.appIfpa.Calculator.layout.Display;

import java.awt.event.ActionEvent;

public class ActionListenerService {
    OperadorService operadorService = new OperadorService();
    private String operator;
    private double num1;
    public void actionPerformed(
            Display display,
            ButtonsSimpleCalculator buttonsSimpleCalculator,
            ButtonsController buttonsController,
            ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == buttonsSimpleCalculator.getNumButtons()[i]) {
                display.addCharInDisplay(String.valueOf(i));
            }
        }
        if (e.getSource() == buttonsSimpleCalculator.getDecButton()) {
            display.addCharInDisplay(".");

        }
        if (e.getSource() == buttonsSimpleCalculator.getAddButton()) {

            num1 = Double.parseDouble(display.getTextInDisplay());
            operator = "+";
            display.deleteTextInDisplay();
        }
        if (e.getSource() == buttonsSimpleCalculator.getSubButton()) {

            num1 = Double.parseDouble(display.getTextInDisplay());
            operator = "-";
            display.deleteTextInDisplay();
        }
        if (e.getSource() == buttonsSimpleCalculator.getMulButton()) {
            num1 = Double.parseDouble(display.getTextInDisplay());
            operator = "*";
            display.deleteTextInDisplay();
        }
        if (e.getSource() == buttonsSimpleCalculator.getDivButton()) {
            num1 = Double.parseDouble(display.getTextInDisplay());
            operator = "/";
            display.deleteTextInDisplay();
        }
        if (e.getSource() == buttonsSimpleCalculator.getEquButton()) {

            double num2 = Double.parseDouble(display.getTextInDisplay());
            double result = operadorService.selecionaOperador(operator, num1, num2);
            display.setTextInDisplay(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == buttonsController.getClrButton()) {
            display.deleteTextInDisplay();
        }
        if (e.getSource() == buttonsController.getDelButton()) {
            display.deleteCharInDisplay();
        }
    }
}

