package com.edu.appIfpa.Calculator.core;

import com.edu.appIfpa.Calculator.layout.ButtonsController;
import com.edu.appIfpa.Calculator.layout.Display;
import com.edu.appIfpa.Calculator.layout.PanelButtons;
import com.edu.appIfpa.Calculator.service.ActionListenerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    ActionListenerService listener = new ActionListenerService();
    private double result = 0;
    private char operator;
    private final Display display = new Display();
    ButtonsController buttonsController = new ButtonsController(this, this);
    PanelButtons panelButtonsSimpleCalculator = new PanelButtons(this);

    public Calculadora() {
        configureFrame();
        display.addDisplay(this);
        panelButtonsSimpleCalculator.addPanel(this);
        buttonsController.addButtonsController(this);
        this.setVisible(true);
    }


    private void configureFrame(){
        this.setTitle("Calculadora");
        this.setSize(420, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        listener.actionPerformed(
                display,
                panelButtonsSimpleCalculator.getButtons(),
                buttonsController,
                e);
    }
}

