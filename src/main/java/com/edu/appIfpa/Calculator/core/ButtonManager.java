package com.edu.appIfpa.Calculator.core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonManager {
    final private JButton button;
    final private ActionListener actionListener;

    private static final int BUTTON_SIZE = 80;

    public ButtonManager(JButton button, ActionListener actionListener) {
        this.button = button;
        this.actionListener = actionListener;
        configureButton();
    }
    private void configureButton() {
        button.addActionListener(actionListener);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));

        // Define cor de fundo e cor de texto
        button.setBackground(Color.LIGHT_GRAY); // Cor de fundo
        button.setForeground(Color.BLACK); // Cor do texto

        // Define borda arredondada (opcional)
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

        // Define o estilo do botão (opcional)
        button.setOpaque(true); // Faz com que a cor de fundo apareça
        button.setBorderPainted(true); // Desenha a borda
    }
}
