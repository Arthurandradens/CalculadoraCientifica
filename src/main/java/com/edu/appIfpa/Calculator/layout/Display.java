package com.edu.appIfpa.Calculator.layout;

import javax.swing.*;
import java.awt.*;

public class Display {
    private final JTextField displayTextField = new JTextField();

    public Display() {
        displayTextField.setEditable(false);
        displayTextField.setFont(new Font("Arial", Font.BOLD, 80));
        displayTextField.setHorizontalAlignment(JTextField.RIGHT);
    }

    public void addDisplay(JFrame frame) {
        frame.add(displayTextField, BorderLayout.NORTH);
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
