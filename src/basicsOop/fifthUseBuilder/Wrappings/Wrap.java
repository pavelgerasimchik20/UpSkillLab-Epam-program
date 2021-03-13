package basicsOop.fifthUseBuilder.Wrappings;

import java.awt.*;

public class Wrap {

    public Material material;
    public Color color;
    public double cost;

    public Wrap(Material material, Color color) {
        this.material = material;
        this.color = color;
        this.cost = Math.random()*100;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s(cost = %.2f$)",material,getCost());
    }
}
