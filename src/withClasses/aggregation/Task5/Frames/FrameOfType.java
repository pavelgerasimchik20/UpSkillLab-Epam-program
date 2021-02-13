package withClasses.aggregation.Task5.Frames;

import withClasses.aggregation.Task5.TechSolution.Checker;
import withClasses.aggregation.Task5.Vouchers.DataForCompare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameOfType extends JFrame {

    private DataForCompare dtf;
    private Checker checker;

    public FrameOfType(DataForCompare d, Checker checker) {
        super("                Select type of tour");
        this.dtf = d;
        this.checker = checker;
        createFrame();
        createButtons();
    }

    public void createButtons() {
        JButton relaxationBtn = new JButton("Relax");
        relaxationBtn.setBackground(Color.orange);
        relaxationBtn.setBounds(50, 20, 280, 30);
        relaxationBtn.setFocusPainted(false);
        add(relaxationBtn);
        relaxationBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });

        JButton excursionBtn = new JButton("Excursion");
        excursionBtn.setBackground(Color.orange);
        excursionBtn.setBounds(50, 65, 280, 30);
        excursionBtn.setFocusPainted(false);
        add(excursionBtn);
        excursionBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });

        JButton healthBtn = new JButton("Health");
        healthBtn.setBackground(Color.orange);
        healthBtn.setFocusPainted(false);
        healthBtn.setBounds(50, 110, 280, 30);
        add(healthBtn);
        healthBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });

        JButton shopBtn = new JButton("Shopping");
        shopBtn.setBackground(Color.orange);
        shopBtn.setFocusPainted(false);
        shopBtn.setBounds(50, 155, 280, 30);
        add(shopBtn);
        shopBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });

        JButton cruiseBtn = new JButton("Cruise");
        cruiseBtn.setBackground(Color.orange);
        cruiseBtn.setBounds(50, 200, 280, 30);
        cruiseBtn.setFocusPainted(false);
        add(cruiseBtn);
        cruiseBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });
    }

    private void saveType(ActionEvent e) {
        dtf.setTypeC(e.getActionCommand());
        checker.check();
    }

    private void createFrame() {
        super.getContentPane().setBackground(Color.darkGray);
        setVisible(true);
        setBounds(250, 170, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
}
