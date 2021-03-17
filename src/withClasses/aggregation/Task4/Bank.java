package withClasses.aggregation.Task4;

import java.util.*;

public class Bank {

    private List<Client> clients = new ArrayList<>();
    private Client client;

    public List<Client> getClients() {
        return clients;
    }

    public Bank(String name) {
    }

    public void findAccounts(Client nameOfClient) {
        TreeSet<Account> sorted = nameOfClient.getAccounts();
        System.out.println(sorted);
    }
}
