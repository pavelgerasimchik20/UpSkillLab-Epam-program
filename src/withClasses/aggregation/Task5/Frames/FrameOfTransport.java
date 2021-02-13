package withClasses.aggregation.Task5.Frames;

import withClasses.aggregation.Task5.TechSolution.Checker;
import withClasses.aggregation.Task5.Vouchers.DataForCompare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameOfTransport extends JFrame {

    private DataForCompare dtf;
    private Checker checker;

    public FrameOfTransport(DataForCompare data, Checker checker) {
        super("                Select transport");
        this.dtf = data;
        this.checker = checker;
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
            saveType(actionEvent);
            dispose();
        });

        JButton selfBtn = new JButton("Self-departure");
        selfBtn.setBackground(Color.orange);
        selfBtn.setBounds(50, 65, 280, 30);
        selfBtn.setFocusPainted(false);
        add(selfBtn);
        selfBtn.addActionListener(actionEvent -> {
            saveType(actionEvent);
            dispose();
        });
    }

    private void saveType(ActionEvent e) {
        dtf.setTransportC(e.getActionCommand());
        checker.check();
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
