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

        // Настроим рендеринг, чтобы добавить ToolTip
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                // Устанавливаем всплывающее сообщение (ToolTip) для каждой страны
                if (value != null) {
                    String country = value.toString();
                    switch (country) {
                        case "Australia":
                            label.setToolTipText("Australia: Known for the Great Barrier Reef and unique wildlife.");
                            break;
                        case "China":
                            label.setToolTipText("China: Famous for its rich history, the Great Wall, and technology.");
                            break;
                        case "England":
                            label.setToolTipText("England: Known for its landmarks such as Big Ben, Buckingham Palace.");
                            break;
                        case "Russia":
                            label.setToolTipText("Russia: The largest country in the world, famous for its history.");
                            break;
                        default:
                            label.setToolTipText("");
                            break;
                    }
                }
                return label;
            }
        });

        // Добавляем JComboBox в центр окна
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);

        // Отображаем окно
        frame.setVisible(true);
    }
}
