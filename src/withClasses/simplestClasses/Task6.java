package withClasses.simplestClasses;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Times times = new Times();
        Times.readTime(new Scanner(System.in));
        times.print();
    }
}

class Times {
    private static int hours, minutes, seconds;

    public Times(int hh, int mm, int ss) {
        setHours(hh);
        setMin(mm);
        setSec(ss);
    }

    public Times(int hh, int mm) {
        this(hh, mm, 0);
    }

    public Times() {
        this(0, 0, 0);
    }

    public static void setHours(int hh) {
        if (hh < 0 || hh > 23)
            hours = 0;
        else
            hours = hh;
    }

    public static void setMin(int mm) {
        if (mm < 0 || mm > 59)
            minutes = 0;
        else
            minutes = mm;
    }

    public static void setSec(int ss) {
        if (ss < 0 || ss > 59)
            seconds = 0;
        else
            seconds = ss;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    static Times readTime(Scanner scanner) {
        Times time = new Times();
        System.out.println("hh: ");
        Times.setHours(scanner.nextInt());

        System.out.println("mm: ");
        Times.setMin(scanner.nextInt());

        System.out.println("ss: ");
        Times.setSec(scanner.nextInt());

        return time;
    }

    public void addSeconds(int ss) {
        seconds += ss;
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

    public void addMinutes(int mm) {
        addSeconds(mm * 60);
    }

    public void addHours(int hh) {
        addSeconds(hh * 60 * 60);
    }
}
