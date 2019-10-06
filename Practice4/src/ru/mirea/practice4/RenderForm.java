package ru.mirea.practice4;

import javafx.css.Match;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RenderForm extends JFrame {
    MatchModel model = new MatchModel();
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel res = new JLabel(String.format("Result: %s X %s", model.getMilan(), model.getMadrid()));
    JLabel last = new JLabel(String.format("Last Scorer: %s", model.getLast()));
    Label winner = new Label(String.format("Winner: %s", model.getWinner()));

    public void changeLabelsText() {
        res.setText(String.format("Result: %s X %s", model.getMilan(), model.getMadrid()));
        last.setText(String.format("Last Scorer: %s", model.getLast()));
        winner.setText(String.format("Winner: %s", model.getWinner()));
    }

    RenderForm() {
        setLayout(new FlowLayout());
        setSize(500, 500);
        add(milan);
        add(res);
        add(last);
        add(madrid);
        add(winner);

        milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                model.goalMilan();
                changeLabelsText();
            }
        });
        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                model.goalMadrid();
                changeLabelsText();
            }
        });
        setVisible(true);
    }
}
