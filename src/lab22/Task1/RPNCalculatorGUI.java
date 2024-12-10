package lab22.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class RPNCalculatorGUI {
    private JFrame frame;
    private JTextField display;
    private Stack<String> rpnStack = new Stack<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RPNCalculatorGUI().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("MyCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                try {
                    double result = evaluateRPN(String.join(" ", rpnStack));
                    display.setText(String.valueOf(result));
                    rpnStack.clear();
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else if (command.equals(".")) {
                if (!rpnStack.isEmpty() && !rpnStack.peek().contains(".")) {
                    rpnStack.push(rpnStack.pop() + ".");
                } else {
                    rpnStack.push("0.");
                }
            } else {
                rpnStack.push(command);
                display.setText(String.join(" ", rpnStack));
            }
        }
    }

    private double evaluateRPN(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new Exception("Недостаточно операндов для операции: " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                try {
                    stack.push(Double.parseDouble(token));
                } catch (NumberFormatException e) {
                    throw new Exception("Неверный токен: " + token);
                }
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Неверное выражение");
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double applyOperator(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }
}