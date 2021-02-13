package withClasses.aggregation.Task5.TechSolution;

import withClasses.aggregation.Task5.Frames.FrameOfDays;
import withClasses.aggregation.Task5.Frames.FrameOfFood;
import withClasses.aggregation.Task5.Frames.FrameOfTransport;
import withClasses.aggregation.Task5.Frames.FrameOfType;
import withClasses.aggregation.Task5.Vouchers.DataForCompare;
import withClasses.aggregation.Task5.Vouchers.ListOfVouchers;
import withClasses.aggregation.Task5.Vouchers.TravelVoucher;

import java.util.List;

public class Solution implements Checker {

    private DataForCompare data = new DataForCompare();
    List<TravelVoucher> travelVoucherList = ListOfVouchers.vouchers;

    public void start() {
        new FrameOfType(data, this);
        new FrameOfTransport(data, this);
        new FrameOfFood(data, this);
        new FrameOfDays(data, this);
    }

    @Override
    public void check() {
        if (data.getTypeC() != null && data.getTransportC() != null && data.getFoodC() != null && data.getAmountOfDaysC() != null) {

            System.out.println("Search results :");

            for (TravelVoucher tr :
                    travelVoucherList) {
                if (tr.getType().equals(data.getTypeC()) &&
                        tr.getTransport().equals(data.getTransportC()) &&
                        tr.getFood().equals(data.getFoodC()) &&
                        tr.getAmountOfDays() == data.getAmountOfDaysC()) {
                    System.out.println(tr);
                }
            }
        }
    }
}
