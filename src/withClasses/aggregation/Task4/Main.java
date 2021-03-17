package withClasses.aggregation.Task4;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        Bank alfaBank = new Bank("АльфаБанк");
        Client petrov;

        alfaBank.getClients().add(petrov = new Client("Petrov"));

        TreeSet<Account> accounts = new TreeSet<>();
        accounts.add(new Account("1", 3000));
        accounts.add(new Account("2", 500));
        accounts.add(new Account("3", -1700));
        accounts.add(new Account("4", 4200));

        petrov.setAccounts(accounts);

        alfaBank.findAccounts(petrov);
        petrov.sumOfAccounts();
        petrov.sum();
    }


}

