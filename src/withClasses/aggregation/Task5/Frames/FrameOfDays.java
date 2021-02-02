package withClasses.aggregation.Task5.Frames;

import withClasses.aggregation.Task5.Vouchers.DataForCompare;

import javax.swing.*;
import java.awt.*;

public class FrameOfDays extends JFrame {

    public FrameOfDays() {
        super("                Select amount of days");
        createFrame();
        createButtons();

    }

    private void createButtons() {
        JButton oneBtn = new JButton("1");
        oneBtn.setBackground(Color.orange);
        oneBtn.setBounds(50, 20, 280, 30);
        oneBtn.setFocusPainted(false);
        add(oneBtn);
        oneBtn.addActionListener(actionEvent -> {
            saveType(oneBtn.getName());
            dispose();
        });

        JButton fiveBtn = new JButton("5");
        fiveBtn.setBackground(Color.orange);
        fiveBtn.setBounds(50, 65, 280, 30);
        fiveBtn.setFocusPainted(false);
        add(fiveBtn);
        fiveBtn.addActionListener(actionEvent -> {
            saveType(fiveBtn.getName());
            dispose();
        });

        JButton sevenBtn = new JButton("7");
        sevenBtn.setBackground(Color.orange);
        sevenBtn.setFocusPainted(false);
        sevenBtn.setBounds(50, 110, 280, 30);
        add(sevenBtn);
        sevenBtn.addActionListener(actionEvent -> {
            saveType(sevenBtn.getName());
            dispose();
        });

        JButton tenBtn = new JButton("10");
        tenBtn.setBackground(Color.orange);
        tenBtn.setFocusPainted(false);
        tenBtn.setBounds(50, 155, 280, 30);
        add(tenBtn);
        tenBtn.addActionListener(actionEvent -> {
            saveType(tenBtn.getName());
            dispose();
        });

        JButton fourteenBtn = new JButton("14");
        fourteenBtn.setBackground(Color.orange);
        fourteenBtn.setBounds(50, 200, 280, 30);
        fourteenBtn.setFocusPainted(false);
        add(fourteenBtn);
        fourteenBtn.addActionListener(actionEvent -> {
            saveType(fourteenBtn.getName());
            dispose();
        });
    }

    private void saveType(String btnName) {
        //DataForCompare.amountOfDaysC = Integer.parseInt(btnName);
    }

    private void createFrame() {
        super.getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        setBounds(650, 477, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
}
