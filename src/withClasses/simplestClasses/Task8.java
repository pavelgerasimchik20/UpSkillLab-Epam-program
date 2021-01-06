package withClasses.simplestClasses;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        List<Customer> list1 = new ArrayList<>();
        list1.add(new Customer(1, "Li", "Tomkins", "", "Chicago 4450 Dovetail Drive", 145, 9332243));
        list1.add(new Customer(2, "James", "Gordon", "", "Chicago 4450 Dovetail Drive", 666, 9332243));
        list1.add(new Customer(3, "Tomi", "Bullock", "", "Chicago 3759 John Calvin Drive", 345, 9332243));
        list1.add(new Customer(4, "Bruce", "Wayne", "", "Chicago 411 Arthur Avenue", 007, 9332243));
        list1.add(new Customer(5, "Alfred", "Wood", "", "Chicago 802 Vesta Drive", 432, 9332243));
        list1.add(new Customer(6, "Jorge", "Alba", "", "Chicago 170 Vesta Drive", 999, 9332243));
        list1.add(new Customer(7, "Leo", "Messi", "", "Chicago 3341 Dovetail Drive", 290, 9332243));
        list1.add(new Customer(8, "Pier", "Guleet", "", "Chicago 2001 Hickman Street", 001, 9332243));
        System.out.println(list1);
        Collections.sort(list1,Comparator.comparing(Customer::toString));
        System.out.println(list1);


    }
}

class Customer implements Comparator<Customer> {

    private int id;
    private String firstName;
    private String secondName;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String firstName, String secondName, String patronymic, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String toString() {
        return "[" + getFirstName() + "." + getSecondName() + "]" + " cred.card № " + getCreditCardNumber();
    }

    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getFirstName().compareTo(c2.getFirstName());
    }

}

