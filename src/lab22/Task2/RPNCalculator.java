package lab22.Task2;

import java.util.Stack;
import java.util.Scanner;

public class RPNCalculator {

    public static double evaluateRPN(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        if (tokens.length == 0) {
            throw new Exception("Выражение не может быть пустым.");
        }

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
                    throw new Exception("Неверный токен: " + token + ". Ожидалось число.");
                }
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Неверное выражение.");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static double applyOperator(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Ошибка: деление на ноль.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }
}