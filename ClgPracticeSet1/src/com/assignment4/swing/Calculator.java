package com.assignment4.swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(400, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        TextField textField = new TextField();
        textField.setBackground(Color.WHITE);
        textField.setBounds(50, 50, 300, 40);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        Button[] buttons = new Button[buttonLabels.length];

        int x = 50;
        int y = 100;
        int buttonWidth = 50;
        int buttonHeight = 50;

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].setBounds(x, y, buttonWidth, buttonHeight);
            x += buttonWidth;

            if ((i + 1) % 4 == 0) {
                x = 50;
                y += buttonHeight;
            }

            jFrame.add(buttons[i]);
            buttons[i].addActionListener(new CalculatorButtonActionListener(textField));
        }

        jFrame.add(textField);
        jFrame.setVisible(true);
    }
}

class CalculatorButtonActionListener implements ActionListener {

    private TextField textField;

    public CalculatorButtonActionListener(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button button = (Button) e.getSource();
        String buttonText = button.getLabel();

        if (buttonText.equals("=")) {
            try {
                textField.setText(String.valueOf(eval(textField.getText())));
            } catch (ArithmeticException ex) {
                textField.setText("Error");
            }
        } else {
            textField.setText(textField.getText() + buttonText);
        }
    }

    private double eval(String expression) {
        // You may implement a proper expression evaluation logic here.
        // For simplicity, I'm leaving it as a placeholder.
        return Double.parseDouble(expression);
    }

	
}

