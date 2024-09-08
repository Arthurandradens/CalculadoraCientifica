package com.edu.appIfpa.Calculator.layout;

import com.edu.appIfpa.Calculator.layout.Display;
import com.edu.appIfpa.Calculator.layout.Panels;
import com.edu.appIfpa.Calculator.service.ActionListenerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    ActionListenerService listener = new ActionListenerService();
    private final Display display = new Display();
    private final Panels panels = new Panels(this);
    private JPanel scientificPanel; // Painel científico

    public Calculator() {
        configureFrame();
        display.addDisplay(this);
        setupLayout();
        this.setVisible(true);
    }

    private void configureFrame() {
        this.setTitle("Calculator");
        this.setSize(420, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }

    private void setupLayout() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Painel central (números)
        mainPanel.add(panels.getNumberPanel().getPanel(), BorderLayout.CENTER);

        // Painéis laterais (operadores e científico)
        JPanel eastPanel = new JPanel(new BorderLayout());
        eastPanel.add(panels.getOperatorPanel().getPanel(), BorderLayout.WEST);

        // Painel científico
        scientificPanel = panels.getScientificPanel().getPanel();
        scientificPanel.setVisible(false); // Inicialmente invisível
        eastPanel.add(scientificPanel, BorderLayout.EAST);

        mainPanel.add(eastPanel, BorderLayout.EAST);

        // Painel de controle
        mainPanel.add(panels.getControllerPanel().getPanel(), BorderLayout.SOUTH);

        this.add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        listener.actionPerformed(display, panels, e);

        // Ajusta o tamanho da janela e a visibilidade do painel científico
        if (panels.isScientificActivated()) {
            this.setSize(800, 550);
            scientificPanel.setVisible(true);
        } else {
            this.setSize(420, 550);
            scientificPanel.setVisible(false);
        }

        // Revalida e repinta o frame para refletir as mudanças
        this.revalidate();
        this.repaint();
    }
}
