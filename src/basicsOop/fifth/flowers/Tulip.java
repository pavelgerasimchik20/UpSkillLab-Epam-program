package basicsOop.fifth.flowers;

public class Tulip implements Flowers{
    private final String name = "Tulip";
    private final double cost = 3.5;
    private final int count;

    public Tulip(int count) {
        this.count = count;
    }

    public Tulip() {
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
        return "Tulip{" +
                "name='" + name + '\'' +
                ", cost=" + getCost() +
                ", count=" + count +
                '}';
    }
}
