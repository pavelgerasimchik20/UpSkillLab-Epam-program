package withClasses.aggregation.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Client petrov, ivanov, sidorov;
        List<Client> cl = new ArrayList();
        cl.add(petrov = new Client("Petrov"));
        cl.add(ivanov = new Client("Ivanov"));
        cl.add(sidorov = new Client("Sidorov"));

        Bank alfaBank = new Bank("АльфаБанк");
        alfaBank.setClients(cl);

        petrov.setAccounts(List.of(
                new Account("1", 3000),
                new Account("2", 1500)
        ));
        ivanov.setAccounts(List.of(
                new Account("1", 3000),
                new Account("5", 200),
                new Account("6", -170),
                new Account("2", 1500)
        ));
        sidorov.setAccounts(List.of(
                new Account("1", -2000),
                new Account("2", 7800)
        ));

        alfaBank.findAccounts(petrov);
        petrov.sortAccounts();
        petrov.sumOfAccounts();
        petrov.sum();
    }


}

