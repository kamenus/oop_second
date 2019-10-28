package ru.mirea.lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GameCore extends JFrame {
    private JButton checkButton = new JButton("TRY");
    private JFormattedTextField numberInput = new JFormattedTextField();

    private int tryNum = 0;

    GameCore() {
        int result = (int) (Math.random() * 20);
        System.out.println(result);
        setLayout(null);
        setSize(500, 500);
        numberInput.setBounds(150, 50, 200,20);
        checkButton.setBounds(150, 80, 200,30);
        add(numberInput);
        add(checkButton);

        checkButton.addActionListener((ActionEvent e) -> {
            if (tryNum < 3) {
                try {
                    int diff = result - Integer.parseInt(numberInput.getText());
                    if (diff == 0) {
                        JOptionPane.showMessageDialog(this, "Congratulations! You win!");
                        System.exit(0);
                    }
                    if (diff < 0) {
                        tryNum++;
                        JOptionPane.showMessageDialog(this, "Number is greater than result", "Wrong number", JOptionPane.ERROR_MESSAGE);
                    }
                    if (diff > 0) {
                        tryNum++;
                        JOptionPane.showMessageDialog(this, "Number is less than result", "Wrong number", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException err) {
                    JOptionPane.showMessageDialog(this, "Enter the number", "Wrong number format", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "You lost");
                System.exit(0);
            }
        });
    }
}
