package basics.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {  //  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
    //  Размеры отверстия предлагаю 33мм * 14мм
    public static void main(String[] args) throws IOException {

        AnotherBrickInTheWall brick = new AnotherBrickInTheWall(0, 0, 0);
        System.out.print("Задайте размеры кирпича в мм: \n x = ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = reader.readLine();
        try {
            brick.setX(Integer.parseInt(tmp));
            System.out.print(" y = ");
            tmp = reader.readLine();
        } catch (NumberFormatException nfe) {
            System.exit(-1);
        }
        try {
            brick.setY(Integer.parseInt(tmp));
            System.out.print(" z = ");
            tmp = reader.readLine();
        } catch (NumberFormatException nfe) {
            System.exit(-2);
        }
        try {
            brick.setZ(Integer.parseInt(tmp));
        } catch(NumberFormatException nfe){
            System.exit(-3);
        }

        brick.checkFit();
    }
}


class AnotherBrickInTheWall {
    private int x;
    private int y;
    private int z;

    public AnotherBrickInTheWall(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void checkFit() {
        if (this.x <= Hole.LINE_A && this.y <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else if (this.y <= Hole.LINE_A && this.x <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else if (this.x <= Hole.LINE_A && this.z <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else if (this.z <= Hole.LINE_A && this.x <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else if (this.z <= Hole.LINE_A && this.y <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else if (this.y <= Hole.LINE_A && this.z <= Hole.LINE_B) {
            System.out.println("Замечательно проходит");
        } else {
            System.out.println("Кирпич не пройдёт через отвестие с размерами " + Hole.LINE_A + " * " + Hole.LINE_B + " мм ");
        }
    }
}

class Hole {
    public static final int LINE_A = 33;
    public static final int LINE_B = 14;
}

