package basicsOop.fifthUseBuilder.Builder;

import basicsOop.fifthUseBuilder.Flowers.FlowerType;
import basicsOop.fifthUseBuilder.Wrappings.Wrap;

public interface Builder {

    void setFlowerType(FlowerType type);
    void addFlowers(int flowers);
    void setWrapping(Wrap wrap);
    void addDecoration();
}
