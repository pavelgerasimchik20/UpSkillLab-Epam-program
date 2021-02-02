package withClasses.aggregation.Task5.Vouchers;

import java.util.List;

public class ListOfVouchers {

    List<TravelVoucher> vouchers = List.of(
            new TravelVoucher("Relax","Transfer","All inclusive",10),
            new TravelVoucher("Relax","Self-departure","Only breakfasts",14),
            new TravelVoucher("Relax","Transfer","Only breakfasts",10),
            new TravelVoucher("Relax","Self-departure","All inclusive",14),
            new TravelVoucher("Excursion","Transfer","Without meals",1),
            new TravelVoucher("Excursion","Transfer","All inclusive",5),
            new TravelVoucher("Excursion","Transfer","Lunch",1),
            new TravelVoucher("Health","Transfer","All inclusive",10),
            new TravelVoucher("Health","Self-departure","All inclusive",5),
            new TravelVoucher("Health","Self-departure","Without meals",7),
            new TravelVoucher("Shopping","Transfer","Without meals",1),
            new TravelVoucher("Shopping","Transfer","Breakfast, Lunch",1),
            new TravelVoucher("Cruise","Transfer","All inclusive",5),
            new TravelVoucher("Cruise","Transfer","All inclusive",7),
            new TravelVoucher("Cruise","Transfer","Only breakfasts",14)
    );
}
