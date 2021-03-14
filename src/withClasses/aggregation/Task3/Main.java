package withClasses.aggregation.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Region minskaja = new Region("Minskaya", "Minsk");
        minskaja.addDistrict(new District("Nesvizhski","Nesvizh"));
        Polity Belarus = new Polity("Belarus", new ArrayList<>(Arrays.asList(
                new Region("Vitebskaya", "Vitebsk"),
                new Region("Gomelskaya", "Gomel"),
                new Region("Mogilevskaya", "Mogilev"),
                new Region("Grodnenskaya", "Grodno"),
                new Region("Brestskaya", "Brest"),
                minskaja)
        ), 207600, "Minsk");
        Belarus.printInfo();
    }
}


