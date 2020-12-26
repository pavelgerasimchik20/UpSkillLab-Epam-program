package withClasses.simplestClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5 {
    public static void main(String[] args) {

        new Counter.MyFrame2();
    }
}

class Counter {
    private static int clicksAmount;
    private final int clicksAmountDefault = 0;

    public Counter() {
        this.clicksAmount = clicksAmountDefault;
    }

    public Counter(int clicksAmount) {
        this.clicksAmount = clicksAmount;
    }

    public static void stepByTop() {
        clicksAmount++;
    }

    public static void setClicksAmount(int clicksAmount) {
        Counter.clicksAmount = clicksAmount;
    }

    public static void stepByDown() {
        clicksAmount--;
    }

    public static int getClicksAmount() {
        return clicksAmount;
    }

    static class MyFrame2 extends JFrame {
        MyFrame2() {
            super("Счётчик");
            setVisible(true);
            setBounds(350, 350, 400, 300);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            JLabel label = new JLabel();
            label.setBounds(50, 50, 360, 50);
            add(label);
            JButton buttonPlus = new JButton("+");
            buttonPlus.setBackground(Color.gray);
            buttonPlus.setBounds(50, 120, 280, 30);
            add(buttonPlus);
            ActionListener actionListenerBTNPlus = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    stepByTop();
                    label.setText(String.valueOf(getClicksAmount()));
                }
            };
            buttonPlus.addActionListener(actionListenerBTNPlus);
            JButton buttonMin = new JButton("-");
            buttonMin.setBackground(Color.gray);
            buttonMin.setBounds(50, 160, 280, 30);
            add(buttonMin);
            ActionListener actionListenerBTNMin = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    stepByDown();
                    label.setText(String.valueOf(getClicksAmount()));
                }
            };
            buttonMin.addActionListener(actionListenerBTNMin);
            JButton buttonDefault = new JButton("Обнулить");
            buttonDefault.setBackground(Color.gray);
            buttonDefault.setBounds(200, 50, 120, 30);
            add(buttonDefault);
            ActionListener actionForBTNDefault = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    setClicksAmount(0);
                    label.setText(String.valueOf(getClicksAmount()));
                }
            };
            buttonDefault.addActionListener(actionForBTNDefault);
        }


    }
}

