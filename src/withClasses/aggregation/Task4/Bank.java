package withClasses.aggregation.Task4;

import java.util.*;

public class Bank {

    private String name;
    private List<Client> clients = new ArrayList<>();
    private Client client;

    public Bank(String name) {
        this.name = name;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void findAccounts(Client nameOfClient) {
        List<Client> client = this.clients;
        System.out.println("Выполнен поиск для " + nameOfClient.getName()+"a");
        for (Client cl :
                client) {
            if (nameOfClient.getName().equalsIgnoreCase(cl.getName())) {
                System.out.println(cl);
            }
        }
        System.out.println();
    }
}
