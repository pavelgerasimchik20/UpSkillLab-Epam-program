package basicsOop.fourth.treasure;

public class Treasure{

    private final Material material;
    private final int cost;

    public Treasure(Material material, int cost) {
        this.material = material;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "material= " + material +
                "  cost= " + cost + " $";
    }

    public int getCost() {
        return cost;
    }
}
