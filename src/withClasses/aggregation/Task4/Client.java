package withClasses.aggregation.Task4;

import com.sun.source.tree.Tree;

import java.util.*;

public class Client {

    private TreeSet<Account> accounts;
    private String name;

    public TreeSet<Account> getAccounts() {
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

    public void setAccounts(TreeSet<Account> accounts) {
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
}
