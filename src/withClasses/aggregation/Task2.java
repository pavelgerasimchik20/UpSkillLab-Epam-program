package withClasses.aggregation;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        Car car = new Car("Subaru",'p');
        System.out.println(car);
        car.printBrandOfaCar();
        car.drive();
        car.refuel();
        car.drive();
        car.replaceWheel("Bridgestone");
        System.out.println(car);
    }
}

class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;
    private boolean move = false;
    private boolean fullTank = false;

    public Car(String brand, Character type) {
        this.brand = brand;
        this.engine = new Engine(type);
        this.wheels = new Wheel[]{
                new Wheel("Hankook"),
                new Wheel("Hankook"),
                new Wheel("Hankook"),
                new Wheel("Hankook"),
        };
    }

    @Override
    public String toString() {
        return brand + " (установлена резина) -> "+ Arrays.toString(wheels);
    }

    public void replaceWheel(String wheel){
        wheels[0]=new Wheel(wheel);
    }

    public void drive() {
        if (fullTank) {
            move = true;
            System.out.println("я поехал)");
        }else{
            System.out.println("Заправь авто");
        }
    }
    public void refuel(){
        fullTank = true;
        System.out.println("Авто запрaвлено");
    }
    public void printBrandOfaCar(){
        System.out.println(brand);
    }
}

class Engine {
    private char type;// d // p

    public Engine(char type) {
        this.type = type;
    }
}

class Wheel {
    private String brand;

    @Override
    public String toString() {
        return brand;
    }

    public Wheel(String brand) {
        this.brand = brand;
    }
}
