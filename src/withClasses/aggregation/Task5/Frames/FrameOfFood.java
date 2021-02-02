package withClasses.aggregation.Task5.Frames;

import withClasses.aggregation.Task5.Vouchers.DataForCompare;

import javax.swing.*;
import java.awt.*;

public class FrameOfFood extends JFrame {
    public FrameOfFood() {
        super("                Select food");
        createFrame();
        createButtons();

    }

    private void createButtons() {
        JButton AIBtn = new JButton("All inclusive");
        AIBtn.setBackground(Color.orange);
        AIBtn.setBounds(50, 20, 280, 30);
        AIBtn.setFocusPainted(false);
        add(AIBtn);
        AIBtn.addActionListener(actionEvent -> {
            saveType(AIBtn.getName());
            dispose();
        });

        JButton breakfastBtn = new JButton("Only breakfasts");
        breakfastBtn.setBackground(Color.orange);
        breakfastBtn.setBounds(50, 65, 280, 30);
        breakfastBtn.setFocusPainted(false);
        add(breakfastBtn);
        breakfastBtn.addActionListener(actionEvent -> {
            saveType(breakfastBtn.getName());
            dispose();
        });

        JButton lunchBtn = new JButton("Lunch");
        lunchBtn.setBackground(Color.orange);
        lunchBtn.setFocusPainted(false);
        lunchBtn.setBounds(50, 110, 280, 30);
        add(lunchBtn);
        lunchBtn.addActionListener(actionEvent -> {
            saveType(lunchBtn.getName());
            dispose();
        });

        JButton breakLunchBtn = new JButton("Breakfast, Lunch");
        breakLunchBtn.setBackground(Color.orange);
        breakLunchBtn.setFocusPainted(false);
        breakLunchBtn.setBounds(50, 155, 280, 30);
        add(breakLunchBtn);
        breakLunchBtn.addActionListener(actionEvent -> {
            saveType(breakLunchBtn.getName());
            dispose();
        });

        JButton withoutMealsBtn = new JButton("Without meals");
        withoutMealsBtn.setBackground(Color.orange);
        withoutMealsBtn.setBounds(50, 200, 280, 30);
        withoutMealsBtn.setFocusPainted(false);
        add(withoutMealsBtn);
        withoutMealsBtn.addActionListener(actionEvent -> {
            saveType(withoutMealsBtn.getName());
            dispose();
        });
    }

    private void saveType(String btnName) {
        //DataForCompare.foodC = btnName;
    }

    private void createFrame() {
        super.getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        setBounds(250, 477, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }

}
