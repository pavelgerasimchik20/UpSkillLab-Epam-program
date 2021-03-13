package basicsOop.fifthUseBuilder;

import basicsOop.fifthUseBuilder.Builder.Florist;
import basicsOop.fifthUseBuilder.Flowers.Bouquet;
import basicsOop.fifthUseBuilder.Manager.Manager;

public class Main {
    public static void main(String[] args) {

        Florist florist = new Florist();
        Manager manager = new Manager();

        manager.createBouquetOfRoses(florist);
        Bouquet roses = florist.getResult();
        System.out.println("Bouquet of roses: " + roses.print() );

        manager.createCheapBouquet(florist);
        Bouquet cheapBouquet = florist.getResult();
        System.out.println("Cheap bouquet: " + cheapBouquet.print());

        manager.createExpensiveBouquet(florist);
        Bouquet expensBouquet = florist.getResult();
        System.out.println("Expensive bouquet: " + expensBouquet.print());

    }
}
