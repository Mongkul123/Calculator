import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    // Create components
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, modulusButton, clearButton;

    // Create constructor
    public Calculator() {
        // Set frame properties
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Initialize components
        JLabel num1Label = new JLabel("First Number:");
        JLabel num2Label = new JLabel("Second Number:");
        JLabel resultLabel = new JLabel("Result:");
        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        modulusButton = new JButton("%");
        clearButton = new JButton("Clear");

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modulusButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(modulusButton);
        add(clearButton);

        // Set frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        } else if (e.getSource() == modulusButton) {
            result = num1 % num2;
        } else if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
            return;
        }
        
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        // Run calculator
        new Calculator();
    }
}
