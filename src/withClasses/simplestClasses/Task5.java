package withClasses.simplestClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Task5 {
    public static void main(String[] args) {

        new Counter.MyFrame2();
    }
}

class Counter {
    private static int minValue;
    private static int clicksAmount;
    private static int maxValue;

    public static void stepByTop() {
        if (clicksAmount < maxValue) {
            clicksAmount++;
        }
    }

    public static void stepByDown() {
        if (clicksAmount > minValue) {
            clicksAmount--;
        }
    }

    public static void setClicksAmount(int clicksAmount) {
        Counter.clicksAmount = clicksAmount;
    }

    public static int getClicksAmount() {
        return clicksAmount;
    }

    static class MyFrame2 extends JFrame {
        MyFrame2() {
            super("Счётчик");
            minValue = Integer.parseInt(JOptionPane.showInputDialog("Введите минимальное значение диапазона для счетчика"));
            maxValue = Integer.parseInt(JOptionPane.showInputDialog("Введите максимальное значение диапазона для счетчика"));
            clicksAmount = minValue;
            setVisible(true);
            setBounds(350, 350, 400, 300);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            JLabel label = new JLabel();
            label.setBounds(50, 50, 360, 50);
            add(label);
            label.setText(String.valueOf(minValue));
            JButton buttonPlus = new JButton("+");
            buttonPlus.setBackground(Color.gray);
            buttonPlus.setBounds(50, 120, 280, 30);
            add(buttonPlus);
            ActionListener actionListenerBTNPlus = actionEvent -> {
                stepByTop();
                label.setText(String.valueOf(getClicksAmount()));
            };
            buttonPlus.addActionListener(actionListenerBTNPlus);
            JButton buttonMin = new JButton("-");
            buttonMin.setBackground(Color.gray);
            buttonMin.setBounds(50, 160, 280, 30);
            add(buttonMin);
            ActionListener actionListenerBTNMin = actionEvent -> {
                stepByDown();
                label.setText(String.valueOf(getClicksAmount()));
            };
            buttonMin.addActionListener(actionListenerBTNMin);
            JButton buttonDefault = new JButton("Обнулить");
            buttonDefault.setBackground(Color.gray);
            buttonDefault.setBounds(200, 50, 120, 30);
            add(buttonDefault);
            ActionListener actionForBTNDefault = actionEvent -> {
                setClicksAmount(minValue);
                label.setText(String.valueOf(getClicksAmount()));
            };
            buttonDefault.addActionListener(actionForBTNDefault);
        }
    }
}

