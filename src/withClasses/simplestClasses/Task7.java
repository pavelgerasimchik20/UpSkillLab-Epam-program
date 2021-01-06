package withClasses.simplestClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Создание треугольника : ");
        System.out.println("Первая сторона = ");
        try {
            double firstSide = scanner.nextDouble();
            System.out.println("Вторая сторона = ");
            double secondSide = scanner.nextDouble();
            System.out.println("Угол между сторонами = ");
            double angle = scanner.nextDouble();
            Triangle triangle = new Triangle(firstSide, secondSide, angle);
            System.out.println("Площадь = " + triangle.findSquare());
            System.out.println("Периметр =" + triangle.findPerimeter());
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Некорректный ввод значений");
        }
    }

}

class Triangle {
    private double lengthFirstSide;
    private double lengthSecondSide;
    private double angleA;

    public Triangle(double lengthFirstSide, double lengthSecondSide, double angleA) {
        if (lengthFirstSide > 0) {
            this.lengthFirstSide = lengthFirstSide;
        } else {
            System.out.println("Создание данного треугольника не возможно");
            System.exit(666);
        }
        if (lengthSecondSide > 0) {
            this.lengthSecondSide = lengthSecondSide;
        } else {
            System.out.println("Создание данного треугольника не возможно");
            System.exit(666);
        }
        if (angleA > 0 && angleA < 180) {
            this.angleA = angleA;
        } else {
            System.out.println("Создание данного треугольника не возможно");
            System.exit(666);
        }
    }

    public double findSquare() {
        return (this.lengthFirstSide * this.lengthSecondSide * Math.sin(angleA)) / 2;
    }

    public double findPerimeter() {
        double lengthThirdSide = Math.sqrt(Math.pow(this.lengthFirstSide, 2) + Math.pow(this.lengthSecondSide, 2)
                - (2 * this.lengthFirstSide * this.lengthSecondSide * Math.cos(angleA)));
        return this.lengthFirstSide + this.lengthSecondSide + lengthThirdSide;
    }

}
