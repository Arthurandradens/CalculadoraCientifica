package com.edu.appIfpa.Calculator.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonsSimpleCalculator {
    final private JButton[] numButtons = new JButton[10]; // Botões numéricos
    final private JButton addButton, subButton, mulButton, divButton;
    final private JButton decButton, equButton;

    ButtonsSimpleCalculator(ActionListener actionListener) {
        // Inicializar botões de operações
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");

        // Array de botões funcionais (6 botões no total, não 8)
        JButton[] funcButtons = {addButton, subButton, mulButton, divButton, decButton, equButton};

        // Adicionar ActionListener, fonte e foco nos botões funcionais
        for (JButton button : funcButtons) {
            button.addActionListener(actionListener);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setFocusable(false);
        }

        // Adicionar ActionListener e configurar botões numéricos (0-9)
        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(actionListener);
            numButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            numButtons[i].setFocusable(false);
        }
    }

    public JButton[] getNumButtons() {
        return numButtons;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getDecButton() {
        return decButton;
    }

    public JButton getEquButton() {
        return equButton;
    }
}
