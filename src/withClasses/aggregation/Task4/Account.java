package withClasses.aggregation.Task4;

public class Account implements Comparable<Account>{

    private String number;
    private final int balance;
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

    @Override
    public int compareTo(Account account) {
        return this.getBalance()- account.getBalance();
    }
}
