package withClasses.aggregation.Task5.Frames;

import withClasses.aggregation.Task5.Vouchers.DataForCompare;

import javax.swing.*;
import java.awt.*;

public class FrameOfTransport extends JFrame {
    public FrameOfTransport() {
        super("                Select transport");
        createFrame();
        createButtons();

    }

    private void createButtons() {
        JButton transferBtn = new JButton("Transfer");
        transferBtn.setBackground(Color.orange);
        transferBtn.setBounds(50, 20, 280, 30);
        transferBtn.setFocusPainted(false);
        add(transferBtn);
        transferBtn.addActionListener(actionEvent -> {
            saveType(transferBtn.getName());
            dispose();
        });

        JButton selfBtn = new JButton("Self-departure");
        selfBtn.setBackground(Color.orange);
        selfBtn.setBounds(50, 65, 280, 30);
        selfBtn.setFocusPainted(false);
        add(selfBtn);
        selfBtn.addActionListener(actionEvent -> {
            saveType(selfBtn.getName());
            dispose();
        });
    }

    private void saveType(String btnName) {
        //DataForCompare.transportC = btnName;
    }

    private void createFrame() {
        super.getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        setBounds(650, 170, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
}
