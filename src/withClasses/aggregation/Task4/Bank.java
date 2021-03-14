package withClasses.aggregation.Task4;

import java.util.*;

public class Bank {

    private String name;
    private List<Client> clients = new ArrayList<>();

    public Bank(String name) {
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
        System.out.println("Выполнен поиск для " + nameOfClient+"a");
        for (Client cl :
                client) {
            if (nameOfClient.equalsIgnoreCase(cl.getName())) {
                System.out.println(cl);
            }
        }
    }
}
