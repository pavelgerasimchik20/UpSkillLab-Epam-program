package basicsOop.fifth.wrapping;

import basicsOop.fifth.flowers.Flowers;

import java.util.List;

public class VelvetBox extends Wrapping {

    private final double cost = 12;
    private final String typeOfWrap = "Velvet box";

    public VelvetBox(List<Flowers> list) {
        super(list);
    }

    public String getTypeOfWrap() {
        return typeOfWrap;
    }

    public double getCost() {
        return cost;
    }
}
