package firstModule.branching;

import java.util.Random;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Task_2 { // Найти max{min(a, b), min(c, d)}. ЧТО-ТО СЛИШКОМ ПРОСТО
    public static void main(String[] args) {

        byte a = (byte) (Math.random()*100);
        byte b = (byte) (Math.random()*100);
        byte c = (byte) (Math.random()*100);
        byte d = (byte) (Math.random()*100);

        byte maxValue = (byte) max(min(a,b),min(c,d));
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("result = " +maxValue);
    }
}
