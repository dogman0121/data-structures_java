package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseTextColor extends JFrame {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Создаем текстовую область
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем меню
        JMenuBar menuBar = new JMenuBar();

        // Меню для выбора цвета
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        menuBar.add(colorMenu);

        // Меню для выбора шрифта
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");

        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16)));
        sansItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16)));
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 16)));

        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);
        menuBar.add(fontMenu);

        // Устанавливаем меню в окно
        frame.setJMenuBar(menuBar);

        // Отображаем окно
        frame.setVisible(true);
    }
}
