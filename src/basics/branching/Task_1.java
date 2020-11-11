package basics.branching;

public class Task_1 {// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

    public static void main(String[] args) {

        Triangle triangle = new Triangle(60, 30);
        triangle.checkTrueTriangle();
    }
}

class Triangle {
    private int angle1, angle2, angle3;

    public Triangle(int angle1, int angle2) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = 180 - angle1 - angle2;
    }

    protected void checkTrueTriangle() {
        if ((angle1 + angle2) > 180) {
            System.out.println("такого треугольника существовать не может");
        } else {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Это прямоугольный треугольник");
            } else {
                System.out.println("Это не прямоугольный треугольник");
            }
        }
    }
}
