package withClasses.aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        Polity Belarus = new Polity("Belarus", new ArrayList<>(Arrays.asList(
                new Region("Vitebskaya", "Vitebsk"),
                new Region("Gomelskaya", "Gomel"),
                new Region("Mogilevskaya", "Mogilev"),
                new Region("Grodnenskaya", "Grodno"),
                new Region("Brestskaya", "Brest"),
                new Region("Minskaya", "Minsk"))
        ), 207600, "Minsk");
        Belarus.printInfo();
    }
}

class Polity {
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

class Region {
    private String name;
    private City centralCity;

    public Region(String name, String centralCity) {
        this.name = name;
        this.centralCity = new City(centralCity);
    }

    @Override
    public String toString() {
        return centralCity.toString();
    }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


