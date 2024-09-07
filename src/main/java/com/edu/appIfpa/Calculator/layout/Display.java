package com.edu.appIfpa.Calculator.layout;

import javax.swing.*;
import java.awt.*;

public class Display {
    private final JTextField displayTextField = new JTextField();
    private int width = 300;

    public Display() {
        displayTextField.setBounds(50, 25, width, 50);
        displayTextField.setEditable(false);
        displayTextField.setFont(new Font("Arial", Font.BOLD, 24));
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void addDisplay(JFrame frame) {
        frame.add(displayTextField);
    }
    public void addCharInDisplay (String value) {
        displayTextField.setText(displayTextField.getText().concat(value));
    }
    public void deleteCharInDisplay () {
        String str = displayTextField.getText();
        displayTextField.setText("");
        for (int i = 0; i < str.length() - 1; i++) {
            displayTextField.setText(displayTextField.getText() + str.charAt(i));
        }
    }
    public void deleteTextInDisplay () {
        displayTextField.setText("");
    }
    public String getTextInDisplay () {
        return displayTextField.getText();
    }
    public void setTextInDisplay (String text) {
        displayTextField.setText(text);
    }
}
