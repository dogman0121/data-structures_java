package lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Match {
    JFrame frame;
    JPanel panel;
    JLabel score;
    JLabel lastGoal;
    JLabel result;
    JButton milan;
    JButton madrid;
    JButton end;

    private int ACMilan = 0;
    private int RealMadrid = 0;
    private boolean ended = false;

    public Match() {
        createGui();
    }

    public void createGui(){
        frame = new JFrame("Ты дурак!!!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        milan = new JButton("AC Milan");
        milan.setSize(100, 100);

        madrid = new JButton("Real Madrid");
        madrid.setSize(100, 100);

        end = new JButton("Закончить матч");
        end.setSize(100, 100);

        panel.add(milan);
        panel.add(madrid);

        score = new JLabel("Result: 0x0");
        lastGoal = new JLabel("Last Scorer: N/A");
        result = new JLabel("Winner: Draw");

        panel.add(score);
        panel.add(lastGoal);
        panel.add(result);
        panel.add(end);

        ActionListener goalListener = new GoalListener();
        ActionListener endMatchListener = new EndMatchListener();
        milan.addActionListener(goalListener);
        madrid.addActionListener(goalListener);
        end.addActionListener(endMatchListener);

        frame.add(panel);
        frame.setVisible(true);
    }

    public class GoalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ended)
                return;
            if (e.getSource() == milan) {
                score.setText("Result: %dx%d".formatted(++ACMilan, RealMadrid));
            }
            else {
                score.setText("Result: %dx%d".formatted(ACMilan, ++RealMadrid));

            }
            lastGoal.setText("Last Scorer: " + e.getActionCommand());

            if (ACMilan > RealMadrid) {
                result.setText("Winner: AC Milan");
            }
            else if (RealMadrid > ACMilan) {
                result.setText("Winner: Real Madrid");
            }
            else {
                result.setText("Winner: Draw");
            }
        }
    }

    public class EndMatchListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ended = true;
            if (ACMilan > RealMadrid) {
                panel.setBackground(new Color(255, 0, 0));
            }else if (RealMadrid > ACMilan) {
                panel.setBackground(new Color(255, 255, 0));
            }
            else {
                JDialog dialog = new JDialog(frame, "Ой-ой-ой!");
                dialog.setSize(400, 200);
                JLabel result = new JLabel("Вы дураки, хватит ставки ставить!!!");
                result.setFont(result.getFont().deriveFont(20f));
                dialog.getContentPane().add(result);
                dialog.setVisible(true);
            }
        }
    }
}
