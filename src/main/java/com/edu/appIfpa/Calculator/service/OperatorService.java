package com.edu.appIfpa.Calculator.service;


public class OperatorService {
    public double selectionOperator(String operator, double num1, double num2) {
            var result = 0.0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "pow":
                    result = Math.pow(num1, num2);
                    break;
                case "sqrt":
                    result = Math.sqrt(num1);
                    break;
                case "sin":
                    result = Math.sin(num1);
                    break;
                case "cos":
                    result = Math.cos(num1);
                    break;
                case "tan":
                    result = Math.tan(num1);
                    break;
                case "cbrt":
                    result = Math.cbrt(num1);
                    break;
                case "log":
                    result = Math.log(num1);
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                case "1/":
                    result = 1/num1;
                    break;
                    default:
                        break;
            }
            return result;
    }

}
