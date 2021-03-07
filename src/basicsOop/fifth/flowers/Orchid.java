package basicsOop.fifth.flowers;

public class Orchid implements Flowers{
    private final String name = "Orchid";
    private final double cost = 12;
    private final int count;

    public Orchid(int count) {
        this.count = count;
    }

    public Orchid() {
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
        return "Orchid{" +
                "name='" + name + '\'' +
                ", cost=" + getCost() +
                ", count=" + count +
                '}';
    }
}
