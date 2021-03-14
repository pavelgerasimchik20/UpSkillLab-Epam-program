package withClasses.aggregation.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {

    private List<Account> accounts = new ArrayList<>();
    private String name;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void sumOfAccounts() {
        int result = 0;
        for (Account acc :
                this.accounts) {
            result += acc.getBalance();
        }
        System.out.println("Сумма по всем счетам " + getName() + "a = " + result + " $");
    }

    public void sum() {
        int resultMore = 0;
        int resultLess = 0;
        for (Account acc :
                this.accounts) {
            if (acc.getBalance() < 0) {
                resultLess += acc.getBalance();
            } else {
                resultMore += acc.getBalance();
            }
        }
        System.out.println("Положительная сумма по всем счетам " + getName() + "a = " + resultMore + " $");
        System.out.println("Отрицательная сумма по всем счетам " + getName() + "a = " + resultLess + " $");
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Client(String str) {
        name = str;
    }

    @Override
    public String toString() {
        return accounts.toString();
    }

    public void sortAccounts() {
        try {
            List<Account> list = this.getAccounts();
            list.sort(Comparator.comparing(Account::getBalance));
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
