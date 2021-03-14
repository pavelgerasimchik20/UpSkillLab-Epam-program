package basicsOop.fourth.dragonscave;

import basicsOop.fourth.treasure.ListOfTreasure;
import basicsOop.fourth.treasure.Treasure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cave implements Helper {

    List<Treasure> treasureList;

    public Cave() {
        this.treasureList = new ListOfTreasure().getList();
    }

    @Override
    public void showListOfTreasure() {
        treasureList.forEach(System.out::println);
    }

    @Override
    public void findExpensive() {
        double tmp = 0;
        for (Treasure treas : treasureList) {
            if (tmp < treas.getCost()) {
                tmp = treas.getCost();
            }
        }
        for (Treasure treas : treasureList) {
            if (tmp == treas.getCost()) {
                System.out.println(treas);
            }
        }
    }

    @Override
    public void selectTreasure(double value) {
        List<Treasure> treas = new ArrayList<>();// перед подбором сортируем по убыванию
        treasureList.sort(Comparator.comparing(Treasure::getCost).reversed());
        for (Treasure tr : treasureList) {
            if (tr.getCost() <= value) {
                value -= tr.getCost();
                treas.add(tr);
            }
            if (value == 0) {
                break;
            }
        }
        treas.forEach(System.out::println);
    }
}
