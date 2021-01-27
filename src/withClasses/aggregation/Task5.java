package withClasses.aggregation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5 {
    public static void main(String[] args) {
        new Frame();
    }
}

class TravelVoucher {
    private String type;
    private String transport;
    private String food;
    private int amountOfDays;

}

class Frame extends JFrame implements ActionListener{

    Frame() {
        super("                Select type of tour");
        createFrame();
        createButtons();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    private void createButtons() {
        JButton relaxationBtn = new JButton("Relax");
        relaxationBtn.setBackground(Color.orange);
        relaxationBtn.setBounds(50, 20, 280, 30);
        relaxationBtn.setFocusPainted(false);
        add(relaxationBtn);
        relaxationBtn.addActionListener(this);

        JButton excursionBtn = new JButton("Excursion");
        excursionBtn.setBackground(Color.orange);
        excursionBtn.setBounds(50, 65, 280, 30);
        excursionBtn.setFocusPainted(false);
        add(excursionBtn);
        excursionBtn.addActionListener(this);

        JButton healthBtn = new JButton("Health");
        healthBtn.setBackground(Color.orange);
        healthBtn.setFocusPainted(false);
        healthBtn.setBounds(50, 110, 280, 30);
        add(healthBtn);
        healthBtn.addActionListener(this);

        JButton shopBtn = new JButton("Shopping");
        shopBtn.setBackground(Color.orange);
        shopBtn.setFocusPainted(false);
        shopBtn.setBounds(50, 155, 280, 30);
        add(shopBtn);
        shopBtn.addActionListener(this);

        JButton cruiseBtn = new JButton("Cruise");
        cruiseBtn.setBackground(Color.orange);
        cruiseBtn.setBounds(50, 200, 280, 30);
        cruiseBtn.setFocusPainted(false);
        add(cruiseBtn);
        cruiseBtn.addActionListener(this);
    }

    private void createFrame() {
        super.getContentPane().setBackground(Color.black);
        setVisible(true);
        setBounds(650, 170, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
}
