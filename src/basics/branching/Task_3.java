package basics.branching;

public class Task_3 {   //   Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static void main(String[] args) {
        Сoordinates xy = new Сoordinates(1, 2, 3, 1, 2, 3); // in Format x1,x2,x3,y1,y2,y3
        System.out.println(xy.check());
    }
}

class Сoordinates implements Checking {
    private final int x1, x2, x3, y1, y2, y3;

    public Сoordinates(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public String check() {
        if (x2 - x1 != 0 && x3 - x1 != 0 && y2 != y1 && y3 != y1) {
            if ((y2 - y1) / (x2 - x1) == (y3 - y1) / (x3 - x1)) {
                System.out.println("three point belong to one line");
            } else {
                System.out.println("three point don`t belong to one line");
            }
        } else if (x2 == x1) {
            if ((y3 - y1) == (y2 - y1) * (x3 - x1)) {
                System.out.println("three point belong to one line");
            } else {
                System.out.println("three point don`t belong to one line");
            }
        } else if (x3 == x1) {
            if ((y2 - y1) == (y3 - y1) * (x2 - x1)) {
                System.out.println("three point belong to one line");
            } else {
                System.out.println("three point don`t belong to one line");
            }
        } else if (y2 == y1) {
            if ((x3 - x1) == (y3 - y1) * (x2 - x1)) {
                System.out.println("three point belong to one line");
            } else {
                System.out.println("three point don`t belong to one line");
            }
        } else {
            if ((x2 - x1) == (y2 - y1) * (x3 - x1)) {
                System.out.println("three point belong to one line");
            } else {
                System.out.println("three point don`t belong to one line");
            }
        }
        return "Solution finished";
    }
}
@FunctionalInterface
interface Checking {
    String check();
}
