package withClasses.aggregation.Task4;

public class Account {

    private String number;
    private int balance;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String number, int balance) {
        this.number = number;
        this.balance = balance;
        this.active = true;
    }

    @Override
    public String toString() {
        if (active) {
            return "Cчёт № " + number + " : " + balance;
        } else {
            return "счёт заблокирован" ;
        }
    }

    public void block() {
        this.active = false;
    }

    public void unblock() {
        this.active = true;
    }
}
