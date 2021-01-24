package withClasses.aggregation;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Bank alfaBank = new Bank("АльфаБанк");
        Client petrov, ivanov, sidorov, smirnov;
        alfaBank.setClients(List.of(petrov = new Client("Petrov"),
                ivanov = new Client("Ivanov"),
                sidorov = new Client("Sidorov"),
                smirnov = new Client("Smirnov")
        ));
        Account account1, account5, account6, account2;
        petrov.setAccounts(List.of(
                account1 = new Account("1", 3000),
                account5 = new Account("5", 200),
                account6 = new Account("6", -170),
                account2 = new Account("2", 1500)
        ));
        Account account3, account4;
        sidorov.setAccounts(List.of(
                account3 = new Account("1", -2000),
                account4 = new Account("2", 7800)
        ));

        alfaBank.findAccounts();
        alfaBank.sortAccounts();
        petrov.sumOfAccounts();
        petrov.sum();
    }


}

class Bank {
    private String name;
    private List<Client> clients;


    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void findAccounts() {
        List<Client> client = this.clients;
        System.out.println("Введите имя клиента:_____");
        Scanner scanner = new Scanner(System.in);
        String nameOfClient = scanner.nextLine();
        System.out.println("Выполнен поиск для " + nameOfClient);
        for (Client cl :
                client) {
            if (nameOfClient.equalsIgnoreCase(cl.getName())) {
                System.out.println(cl);
            }
        }
    }

    public void sortAccounts() {
        List<Client> client = this.clients;
        System.out.println("Введите имя клиента для сортировки счетов:_____");
        Scanner scanner = new Scanner(System.in);
        String nameOfClient = scanner.nextLine();
        System.out.println("Выполнена сортировка для " + nameOfClient);
        try{for (Client cl :
                client) {
            if (nameOfClient.equalsIgnoreCase(cl.getName())) {
                List<Account> accountsList = List.copyOf(cl.getAccounts());
                Collections.sort(accountsList, Account.COMPARE_BY_BALANCE);
                System.out.println(accountsList);
            }
        }}catch (UnsupportedOperationException e){
            System.err.println(e);
        }
    }

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Account implements Serializable {
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
            return "счёт заблокирован";
        }
    }

    public void block() {
        this.active = false;
    }

    public void unblock() {
        this.active = true;
    }

    public static final Comparator<Account> COMPARE_BY_BALANCE = new Comparator<Account>() {
        @Override
        public int compare(Account lhs, Account rhs) {
            return lhs.getBalance() - rhs.getBalance();
        }
    };
}

class Client {
    private List<Account> accounts;
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
        System.out.println("Сумма по всем счетам = " + result + " $");
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
        System.out.println("Положительная сумма по всем счетам = " + resultMore + " $");
        System.out.println("Отрицательная сумма по всем счетам = " + resultLess + " $");
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
}

