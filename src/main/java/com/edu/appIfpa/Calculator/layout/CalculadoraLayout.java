package com.edu.appIfpa.Calculator.layout;

import com.edu.appIfpa.Calculator.core.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraLayout extends JFrame {
    List<JButton> numList = new ArrayList<>();
    final private JButton addButton, subButton, mulButton, divButton;
    final private JButton decButton, equButton;
    private JPanel panel = new JPanel();
    private ActionListener actionListener;

    public CalculadoraLayout(ActionListener actionListener) {
        this.actionListener = actionListener;
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");

        inicializaOperadores();
        inicializaNumeros();
        inicializaPainel();
    }

    public List<JButton> getNumList() {
        return numList;
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

    public ActionListener getActionListener() {
        return actionListener;
    }

    public void inicializaOperadores () {
        List <JButton> operadoresList = new ArrayList<>(6);
        operadoresList.add(addButton);
        operadoresList.add(subButton);
        operadoresList.add(mulButton);
        operadoresList.add(divButton);
        operadoresList.add(decButton);
        operadoresList.add(equButton);

        adicionaPropriedadesAoBotao(operadoresList);
    }

    public void inicializaNumeros(){

        for (int i = 0; i < 10; i++) {
            numList.add(new JButton(String.valueOf(i)));
        }
        adicionaPropriedadesAoBotao(numList);
    }

    public void adicionaPropriedadesAoBotao(List<JButton> list){
        list.forEach(b -> {
            b.addActionListener(this.actionListener);
            b.setFont(new Font("Arial",Font.BOLD,20));
            b.setFocusable(false);
        });
    }

   void inicializaPainel(){

        // Criando um painel para organizar os botões
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Adiciona os botões ao painel
        panel.add(numList.get(0));
        panel.add(numList.get(1));
        panel.add(numList.get(2));
        panel.add(addButton);
        panel.add(numList.get(3));
        panel.add(numList.get(4));
        panel.add(numList.get(5));
        panel.add(subButton);
        panel.add(numList.get(6));
        panel.add(numList.get(7));
        panel.add(numList.get(8));
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numList.get(9));
        panel.add(equButton);
        panel.add(divButton);
    }

    public JPanel getPanel() {
        return panel;
    }
}
