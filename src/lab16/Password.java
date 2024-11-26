package lab16;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Password {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password application");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel body = new JPanel();
        body.setBorder(new EmptyBorder(5, 20, 10, 20));
        body.setLayout(new GridLayout(3, 2, 10, 5));

        JLabel service = new JLabel("Service:");
        service.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField serviceField = new JTextField(10);

        JLabel user = new JLabel("User name:");
        user.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField userField = new JTextField(10);

        JLabel password = new JLabel("Password:");
        password.setHorizontalAlignment(SwingConstants.RIGHT);
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setEchoChar('*');

        body.add(service);
        body.add(serviceField);
        body.add(user);
        body.add(userField);
        body.add(password);
        body.add(passwordField);

        frame.add(body, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
