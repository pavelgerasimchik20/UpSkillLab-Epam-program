package withClasses.simplestClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    private static String numberOfTrain;

    public static void main(String[] args) {

        System.out.println("Введите номер действия:\n1. Отсортировать поезда по номерам\n2. Информация по номеру поезда\n3. Отсортировать по пункту назначения\n-->");
        Scanner scanner = new Scanner(System.in);
        try {
            int key = scanner.nextInt();
            switch (key) {
                case (1):
                    new MyFrame();
                    break;
                case (2):
                    System.out.println("Введите номер поезда:");
                    scanner = new Scanner(System.in);
                    findTrain(Integer.parseInt(scanner.nextLine()));
                    break;
                case (3):
                    sortForSameDestination(sortByDestination(Host.createListOfTrains()));
                    break;
                default:
                    System.out.println("Выберите корректный вариант");
                    break;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Выберите корректный вариант");
        }
    }

    private static void sortForSameDestination(Train[] trains) {
        boolean sorted = false;
        Train temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if ((trains[i].getDestination()).equals(trains[i + 1].getDestination())) {
                    if ((trains[i].getTime().getHours() > trains[i + 1].getTime().getHours()) ||
                            ((trains[i].getTime().getHours() == trains[i + 1].getTime().getHours()) &&
                                    (trains[i].getTime().getMinutes() > trains[i + 1].getTime().getMinutes()))) {
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(trains));
    }

    private static Train[] sortByDestination(Train[] trains) {
        Train tmp;
        for (int min = 0; min < trains.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < trains.length; j++) {
                if (trains[j].getDestination().length() < trains[least].getDestination().length()) {
                    least = j;
                }
            }
            tmp = trains[min];
            trains[min] = trains[least];
            trains[least] = tmp;
        }
        return trains;
    }


    private static void findTrain(int number) {
        Train[] trains = Host.createListOfTrains();
        for (Train tr :
                trains) {
            if (number == tr.getNumber()) {
                System.out.println(tr);
                break;
            }
        }
        System.out.println("...поиск завершен...");
    }
}

class MyFrame extends JFrame implements ActionListener {
    MyFrame() {
        super("Минск- Северный 2");
        setVisible(true);
        setBounds(350, 350, 400, 300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel label = new JLabel("Хотите отсортировать поезда по номерам ???");
        label.setBounds(50, 50, 360, 50);
        add(label);
        JButton button = new JButton("Да");
        button.setBackground(Color.gray);
        button.setBounds(50, 120, 280, 30);
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Host.sort(Host.createListOfTrains());
        System.exit(0);
    }
}

class Host {
    public static Train[] createListOfTrains() {
        Train[] trains = new Train[5];
        trains[0] = new Train(new Time(10, 30), "Minsk", 664);
        trains[1] = new Train(new Time(00, 00), "Moscow", 1311);
        trains[2] = new Train(new Time(10, 00), "Minsk", 44412);
        trains[3] = new Train(new Time(12, 30), "Gomel", 14);
        trains[4] = new Train(new Time(19, 55), "Kaliningrad", 9983);
        return trains;
    }

    public static void sort(Train[] trains) {
        Train tmp;
        for (int min = 0; min < trains.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < trains.length; j++) {
                if (trains[j].getNumber() < trains[least].getNumber()) {
                    least = j;
                }
            }
            tmp = trains[min];
            trains[min] = trains[least];
            trains[least] = tmp;
        }
        System.out.println(Arrays.toString(trains));
    }
}

class Train {
    private Time time;

    private String destination;
    private int number;

    public Train(Time time, String destination, int number) {
        this.time = time;
        this.destination = destination;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Поезд №%s, пункт назначения %s, %s", number, destination, time);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public Time getTime() {
        return time;
    }
}

class Time {
    private final int MAX_MINUTES = 60;
    private final int MAX_HOURS = 24;
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        if (hours < MAX_HOURS) {
            this.hours = hours;
        }
        if (minutes < MAX_MINUTES) {
            this.minutes = minutes;
        } else {
            System.out.println("incorrect creating of an object");
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        if (hours == 0 && minutes == 0) {
            return "время отправления - [00:00]";
        } else if (hours == 0) {
            return String.format("время отправления - [00:%2s]", minutes);
        } else if (minutes == 0) {
            return String.format("время отправления - [%2s:00]", hours);
        } else {
            return String.format("время отправления - [%2s:%2s]", hours, minutes);
        }
    }
}

