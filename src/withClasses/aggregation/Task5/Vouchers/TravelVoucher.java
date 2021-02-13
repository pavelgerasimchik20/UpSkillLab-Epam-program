package withClasses.aggregation.Task5.Vouchers;

public class TravelVoucher {
    private String type;
    private String transport;
    private String food;
    private int amountOfDays;

    public TravelVoucher(String type, String transport, String food, int amountOfDays) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.amountOfDays = amountOfDays;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", amountOfDays=" + amountOfDays +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }
}
