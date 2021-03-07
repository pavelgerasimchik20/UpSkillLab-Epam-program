package basicsOop.fifth.flowers;

public class Rose implements Flowers {

    private final String name = "Rose";
    private final double cost = 7;
    private final int count;

    public Rose(int count) {
        this.count = count;
    }

    public Rose() {
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost * count;
    }


    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() +
                ", count=" + getCount() +
                '}';
    }
}

