package basicsOop.fifth.wrapping;

import basicsOop.fifth.flowers.Flowers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Wrapping {

    public abstract double getCost();

    public abstract String getTypeOfWrap();

    private List<Flowers> flowers = new ArrayList<>();

    public Wrapping(Flowers flowers) {
        this.flowers.add(flowers);
    }

    public Wrapping(List<Flowers> flowers) {
        this.flowers.addAll(flowers);
    }

    public void display() {

        double cost = 0;
        for (Flowers sw : flowers) {

            cost += sw.getCost();
        }
        JOptionPane.showMessageDialog(null,("Flowers: " + cost +
                " + " + getTypeOfWrap() + ": " + getCost() + " = " + (cost + getCost())),"COMPOSITION`s COsT",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapping wrap = (Wrapping) o;
        return Objects.equals(flowers, wrap.flowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers);
    }
}
