package com.edu.appIfpa.Calculator.service;


public class OperadorService {
    public double selecionaOperador(String operator, double num1, double num2) {
            var result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default -> 0.0;
            };

        return result;
    }

}
