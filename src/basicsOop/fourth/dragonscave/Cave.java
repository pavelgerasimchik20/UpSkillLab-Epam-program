package basicsOop.fourth.dragonscave;

import basicsOop.fourth.treasure.Material;
import basicsOop.fourth.treasure.Treasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cave implements Helper {

    List<Treasure> treasureList;

    public Cave() {
        this.treasureList = onCreateList();
    }

    private List<Treasure> onCreateList() {
        ArrayList<Treasure> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 3 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 5 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 7 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 11 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 13 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else if (i % 17 == 0) {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            } else {
                list.add(new Treasure(randomEnum(), random.nextInt(10000)));
            }
        }
        return list;
    }

    private Material randomEnum() {
        Material rndMaterial;
        int random = (int) (Math.random() * (10 - 1) + 1);
        switch (random) {
            case (1):
                rndMaterial = Material.GOLD;
                break;
            case (2):
                rndMaterial = Material.SILK;
                break;
            case (3):
                rndMaterial = Material.PAPER;
                break;
            case (4):
                rndMaterial = Material.PLATINUM;
                break;
            case (5):
                rndMaterial = Material.COPPER;
                break;
            case (6):
                rndMaterial = Material.ALUMINUM;
                break;
            case (7):
                rndMaterial = Material.WOOD;
                break;
            case (8):
                rndMaterial = Material.WOOL;
                break;
            case (9):
                rndMaterial = Material.SILVER;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + random);
        }
        return rndMaterial;
    }

    public void show() {
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
        List<Treasure> treas = new ArrayList<>();
        double tmp = 0;
        for (Treasure tr : treasureList) {
            if (tr.getCost() <= value) {
                value -= tr.getCost();
                treas.add(tr);
                tmp = value;
            }
            if (value == 0) {
                break;
            }
        }
        treas.forEach(System.out::println);
    }
}
