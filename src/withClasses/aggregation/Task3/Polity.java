package withClasses.aggregation.Task3;

import java.util.ArrayList;
import java.util.List;

public class Polity {

    private String name;
    private List<Region> regions;
    private int square;

    private String capital;

    public Polity(String name, ArrayList<Region> regions, int square, String capital) {
        this.name = name;
        this.regions = regions;
        this.square = square;
        this.capital = capital;
    }

    public void printInfo() {
        System.out.println("Столица: " + capital);
        System.out.println("Количество областей: " + regions.size());
        System.out.println("Площадь: " + square);
        System.out.println("Областные центры: ");
        for (Region reg :
                regions) {
            System.out.print(reg.toString() + " ");
        }
    }


}
