package basicsOop.fifth.wrapping;

import basicsOop.fifth.flowers.Flowers;

import java.util.List;

public class GoldPaper extends Wrapping {

    private final double cost = 20;
    private final String typeOfWrap = "Gold Paper";

    public GoldPaper(List<Flowers> list) {
        super(list);
    }

    public String getTypeOfWrap() {
        return typeOfWrap;
    }

    public double getCost() {
        return cost;
    }
}
