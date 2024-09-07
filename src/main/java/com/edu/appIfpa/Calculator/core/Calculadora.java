package com.edu.appIfpa.Calculator.core;

import com.edu.appIfpa.Calculator.layout.CalculadoraLayout;
import com.edu.appIfpa.Calculator.service.OperadorService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    // Declara os componentes da calculadora
    final private JTextField display;
    final private OperadorService operadorService = new OperadorService();
    final private CalculadoraLayout calculadoraLayout = new CalculadoraLayout(this);

    // Variáveis para cálculos
    private double num1 = 0;
    private double result = 0;
    private String operator;
    // buttons
    private JButton delButton = new JButton("Del");
    private JButton clrButton = new JButton("C");

    public Calculadora() {
        // Configura o JFrame
        this.setTitle("Calculadora");
        this.setSize(420, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);



        // Campo de texto para exibir o resultado
        display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        this.add(display);
        this.add(calculadoraLayout.getPanel());


        adicionaPropridadesAosBotoes();

        this.add(delButton);
        this.add(clrButton);

        this.setVisible(true);

    }

    private void adicionaPropridadesAosBotoes() {
        // Botões de limpar e deletar
        delButton.setBounds(50, 420, 145, 50);
        clrButton.setBounds(205, 420, 145, 50);
        //adicionar evento
        delButton.addActionListener(this);
        clrButton.addActionListener(this);
    }

    // Método para lidar com eventos dos botões
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == calculadoraLayout.getNumList().get(i)) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == calculadoraLayout.getDecButton()) {
            display.setText(display.getText().concat("."));
        }
        if (e.getSource() == calculadoraLayout.getAddButton()) {
            num1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        }
        if (e.getSource() == calculadoraLayout.getSubButton()) {
            num1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        }
        if (e.getSource() == calculadoraLayout.getMulButton()) {
            num1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        }
        if (e.getSource() == calculadoraLayout.getDivButton()) {
            num1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        }
        if (e.getSource() == calculadoraLayout.getEquButton()){
            double num2 = Double.parseDouble(display.getText());

           var result = operadorService.selecionaOperador(operator,num1,num2);
            display.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) display.setText("");


        if (e.getSource() == delButton) {
            String str = display.getText();
            display.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                display.setText(display.getText() + str.charAt(i));
            }
        }
    }
}
