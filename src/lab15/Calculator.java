package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // Создаем основное окно
        JFrame frame = new JFrame("Простой калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550);
        frame.setLayout(new BorderLayout(10, 10));

        // Поле для отображения формулы (история вычислений)
        JTextField formulaField = new JTextField();
        formulaField.setFont(new Font("Arial", Font.PLAIN, 18));
        formulaField.setHorizontalAlignment(JTextField.RIGHT);
        formulaField.setEditable(false);
        formulaField.setPreferredSize(new Dimension(400, 40));
        frame.add(formulaField, BorderLayout.NORTH);

        // Поле для ввода/вывода результата
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setPreferredSize(new Dimension(400, 60));
        frame.add(textField, BorderLayout.CENTER);

        // Панель для кнопок
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(panel, BorderLayout.SOUTH);

        // Кнопки
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        // Переменные для вычислений
        final String[] operator = {""};
        final double[] currentResult = {0}; // Промежуточный результат
        final boolean[] isOperatorClicked = {false}; // Указывает, что была нажата операция
        final boolean[] isResultDisplayed = {false}; // Указывает, что результат уже отображен
        final StringBuilder formula = new StringBuilder(); // Формула вычислений

        // Добавляем кнопки на панель
        for (String btnText : buttons) {
            JButton button = new JButton(btnText);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setPreferredSize(new Dimension(50, 50));
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();

                    if ("0123456789".contains(command)) {
                        if (isOperatorClicked[0] || isResultDisplayed[0]) {
                            textField.setText(""); // Очищаем поле для нового числа
                            isOperatorClicked[0] = false;
                            isResultDisplayed[0] = false;
                        }
                        textField.setText(textField.getText() + command);
                        formula.append(command);
                        formulaField.setText(formula.toString());
                    } else if (".".equals(command)) {
                        // Обработка ввода точки
                        if (!textField.getText().contains(".")) {
                            if (textField.getText().isEmpty()) {
                                textField.setText("0.");
                                formula.append("0.");
                            } else {
                                textField.setText(textField.getText() + ".");
                                formula.append(".");
                            }
                            formulaField.setText(formula.toString());
                        }
                    } else if ("/*-+".contains(command)) {
                        if (!operator[0].isEmpty() && !isOperatorClicked[0]) {
                            // Выполняем предыдущую операцию перед новой
                            performCalculation(textField, operator, currentResult);
                        } else {
                            try {
                                currentResult[0] = Double.parseDouble(textField.getText());
                            } catch (NumberFormatException ex) {
                                textField.setText("Ошибка");
                                return;
                            }
                        }
                        operator[0] = command; // Сохраняем текущую операцию
                        formula.setLength(0); // Сбрасываем историю после операции
                        formula.append(currentResult[0]).append(" ").append(command).append(" ");
                        formulaField.setText(formula.toString());
                        isOperatorClicked[0] = true;
                    } else if ("=".equals(command)) {
                        performCalculation(textField, operator, currentResult);
                        operator[0] = ""; // Сбрасываем оператор
                        formula.setLength(0); // Очищаем историю
                        formula.append(currentResult[0]); // Оставляем результат
                        formulaField.setText(formula.toString());
                        isResultDisplayed[0] = true;
                    } else if ("C".equals(command)) {
                        textField.setText("");
                        formulaField.setText("");
                        formula.setLength(0);
                        operator[0] = "";
                        currentResult[0] = 0;
                        isOperatorClicked[0] = false;
                        isResultDisplayed[0] = false;
                    }
                }
            });
        }

        // Отображение окна
        frame.setVisible(true);
    }

    private static void performCalculation(JTextField textField, String[] operator, double[] currentResult) {
        double secondNumber;
        try {
            secondNumber = Double.parseDouble(textField.getText());
        } catch (NumberFormatException ex) {
            textField.setText("Ошибка");
            return;
        }

        switch (operator[0]) {
            case "+" -> currentResult[0] += secondNumber;
            case "-" -> currentResult[0] -= secondNumber;
            case "*" -> currentResult[0] *= secondNumber;
            case "/" -> {
                if (secondNumber == 0) {
                    textField.setText("Ошибка: деление на 0");
                    operator[0] = ""; // Сбрасываем оператор
                    return;
                }
                currentResult[0] /= secondNumber;
            }
        }
        textField.setText(String.valueOf(currentResult[0]));
    }
}