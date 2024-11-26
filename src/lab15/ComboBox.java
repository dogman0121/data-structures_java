package lab15;

import javax.swing.*;
import java.awt.*;

public class ComboBox {
    public static void main(String[] args) {
        // Создаем JFrame (основное окно)
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Создаем массив с элементами для JComboBox
        String[] countries = {"Australia", "China", "England", "Russia"};

        // Создаем JComboBox и заполняем его элементами
        JComboBox<String> comboBox = new JComboBox<>(countries);

        // Устанавливаем "Australia" как выбранный элемент по умолчанию
        comboBox.setSelectedIndex(0);

        // Добавляем JComboBox в центр окна
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);

        // Отображаем окно
        frame.setVisible(true);
    }
}