package basicsOop.fifth.wrapping;

import basicsOop.fifth.flowers.Flowers;

import java.util.List;

public class Paper extends Wrapping {

    private final double cost = 2;
    private final String typeOfWrap = "Craft Paper";

    public Paper(List<Flowers> list) {
        super(list);
    }

    public String getTypeOfWrap() {
        return typeOfWrap;
    }

    public double getCost() {
        return cost;
    }
}
