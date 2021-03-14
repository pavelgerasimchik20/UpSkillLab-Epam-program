package basicsOop.fourth.treasure;

public class Treasure {

    private final Material material;
    private final double cost;

    public Treasure(Material material, double cost) {
        this.material = material;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Material-> %s, cost= %.2f $", material, cost);
    }

    public double getCost() {
        return cost;
    }
}
