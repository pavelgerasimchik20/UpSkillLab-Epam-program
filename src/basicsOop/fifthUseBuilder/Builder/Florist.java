package basicsOop.fifthUseBuilder.Builder;

import basicsOop.fifthUseBuilder.Flowers.Bouquet;
import basicsOop.fifthUseBuilder.Flowers.FlowerType;
import basicsOop.fifthUseBuilder.Wrappings.Wrap;

public class Florist implements Builder{

    private FlowerType type;
    private int flowers;
    private Wrap wrap;
    private boolean isDecoration;

    @Override
    public void setFlowerType(FlowerType type) {
        this.type = type;
    }

    @Override
    public void setWrapping(Wrap wrap) {
        this.wrap = wrap;
    }

    @Override
    public void addFlowers(int flowers) {
        if (flowers > 0) {
            this.flowers = flowers;
        } else {
            System.out.println("Bouquet is empty");
        }
    }
    @Override
    public void addDecoration(){
        this.isDecoration = true;
    }

    public Bouquet getResult() {
            return new Bouquet(type, flowers, wrap, isDecoration);
    }
}
