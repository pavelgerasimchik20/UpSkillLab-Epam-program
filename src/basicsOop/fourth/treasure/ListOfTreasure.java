package basicsOop.fourth.treasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfTreasure {

    List<Treasure> list = new ArrayList<>();

    public ListOfTreasure() {
        for (int i = 0; i < 100; i++) {
            this.list.add(new Treasure(getRandomMaterial(), Math.random() * 1000));
        }
    }

    private Material getRandomMaterial() {
        List<Material> materials = new ArrayList<>(Arrays.asList(Material.values()));
        return materials.get((int) (Math.random() * 9));
    }

    public List<Treasure> getList() {
        return list;
    }
}
