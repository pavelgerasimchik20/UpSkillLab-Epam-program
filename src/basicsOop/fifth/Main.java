package basicsOop.fifth;

import basicsOop.fifth.flowers.Flowers;
import basicsOop.fifth.flowers.Orchid;
import basicsOop.fifth.flowers.Rose;
import basicsOop.fifth.flowers.Tulip;
import basicsOop.fifth.wrapping.GoldPaper;
import basicsOop.fifth.wrapping.Paper;
import basicsOop.fifth.wrapping.VelvetBox;
import basicsOop.fifth.wrapping.Wrapping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Flowers> flowers = new ArrayList<>();

    public static void main(String[] args) {

        createComposition("rose and orchid and tulip");

        Wrapping wrapping = wrap(flowers);
        wrapping.display();

    }

    private static void createComposition(String str) {
        if (str.toLowerCase().contains("rose")) {
            flowers.add(new Rose(1));
        }
        if (str.toLowerCase().contains("tulip")) {
            flowers.add(new Tulip(1));
        }
        if (str.toLowerCase().contains("orchid")) {
            flowers.add(new Orchid(1));
        }
    }

    private static Wrapping wrap(List<Flowers> list) {
        int count = 0;
        for (Flowers fl : list) {
            count += fl.getCount();
        }
        if (count < 10) {
            return new Paper(list);
        } else if (count < 50) {
            return new VelvetBox(list);
        } else {
            return new GoldPaper(list);
        }
    }
}
