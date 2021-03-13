package basicsOop.fifthUseBuilder.Manager;

import basicsOop.fifthUseBuilder.Builder.Florist;
import basicsOop.fifthUseBuilder.Flowers.FlowerType;
import basicsOop.fifthUseBuilder.Wrappings.Material;
import basicsOop.fifthUseBuilder.Wrappings.Wrap;

import java.awt.*;

public class Manager {

    private Florist florist;

    public void createCheapBouquet(Florist florist){
        florist.setFlowerType(FlowerType.SUNFLOWER);
        florist.addFlowers(1);
        florist.setWrapping(null);
    }

    public void createExpensiveBouquet(Florist florist){
        florist.setFlowerType(FlowerType.ORCHID);
        florist.addFlowers(100);
        florist.setWrapping(new Wrap(Material.VELVET, Color.RED));
        florist.addDecoration();
    }

    public void createBouquetOfRoses(Florist florist){
        florist.setFlowerType(FlowerType.ROSE);
        florist.addFlowers((int) (Math.random()*100));
        florist.addDecoration();
        florist.setWrapping(new Wrap(Material.PAPER_BOX,Color.BLACK));
    }
}
