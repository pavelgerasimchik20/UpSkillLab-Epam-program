package withClasses.simplestClasses;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        chooseAction();
    }

    private static void chooseAction() {
        while (true) {
            System.out.println("Выберите действие:\n1.Список книг заданного автора" +
                    "                             \n2.Список книг заданного издательства" +
                    "                             \n3.Список книг выпущенных после заданного года" +
                    "                             \n4.Выход" +
                    "                             \n...");
            Scanner scanner = new Scanner(System.in);
            try {
                int key = scanner.nextInt();
                switch (key) {
                    case (1):
                        printTheListOfBooksByAuthor();
                        break;
                    case (2):
                        printTheListOfBooksByPublishingHouse();
                        break;
                    case (3):
                        printTheListOfBooksPastYear();
                        break;
                    case (4):
                        return;
                    default:
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("----------------------Введите номер нужной операции--------------------");
            } catch (Throwable throwable) {
                System.out.println("something went wrong");
            }
        }
    }

    private static void printTheListOfBooksPastYear() {
        System.out.println("Введите год публикации: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int yearOfPubl = scanner.nextInt();
            ListOfBooks list = new ListOfBooks();
            ArrayList<Book> listOfBooks = list.getListOfBooks();
            for (Book book :
                    listOfBooks) {
                if ( yearOfPubl < book.getYearOfPublishing()) {
                    System.out.println(book);
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }

    private static void printTheListOfBooksByPublishingHouse() {
        System.out.println("Введите название издательства: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String nameOfPublHouse = scanner.nextLine();
            ListOfBooks list = new ListOfBooks();
            ArrayList<Book> listOfBooks = list.getListOfBooks();
            for (Book book :
                    listOfBooks) {
                if (nameOfPublHouse.equalsIgnoreCase(book.getPublishingHouse())
                        || book.getPublishingHouse().toLowerCase(Locale.ROOT).contains(nameOfPublHouse.toLowerCase(Locale.ROOT))) {
                    System.out.println(book);
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }

    private static void printTheListOfBooksByAuthor() {
        System.out.println("Введите имя автора: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String nameOfAuthor = scanner.nextLine();
            ListOfBooks list = new ListOfBooks();
            ArrayList<Book> listOfBooks = list.getListOfBooks();
            for (Book book :
                    listOfBooks) {
                if (nameOfAuthor.equalsIgnoreCase(book.getAuthor()) || book.getAuthor().toLowerCase(Locale.ROOT).contains(nameOfAuthor.toLowerCase(Locale.ROOT))) {
                    System.out.println(book);
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }
}

class Book {
    private final long id;
    private final String name;
    private final String author;
    private final String publishingHouse;
    private final int yearOfPublishing;
    private final int amountOfPages;
    private final int price;
    private final String bindingType;

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return name + "  \n" + author + " ©" + "\n" + publishingHouse+", "+yearOfPublishing+"\n----------------------------------";
    }

    public Book(long id, String name, String author, String publishingHouse, int yearOfPublishing, int amountOfPages, int price, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getAuthor() {
        return author;
    }
}

class ListOfBooks {

    public ArrayList<Book> getListOfBooks() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book(444111, "Lord Of the Ring", "J.R.R.Tolkien", "George Allen & Unwin", 1954, 860, 220, "hard binding"));
        listOfBooks.add(new Book(98733301, "A Song of Ice and Fire", " Martin George R.R", "Voyager Books", 1996, 922, 550, "hard binding"));
        listOfBooks.add(new Book(1313, "Война и мир", "Л.Н.Толстой", "Русский вестник", 1865, 1878, 320, "soft binding"));
        listOfBooks.add(new Book(32674586, "It", "Stephen King", "Viking press", 1986, 650, 275, "hard binding"));
        listOfBooks.add(new Book(5321, "Devil in the white city", "Eric Larson", "Crown Publishers", 2003, 550, 155, "hard and soft binding"));
        listOfBooks.add(new Book(2411, "Harry Potter and the Philosopher's Stone", "J.Rowling", "Bloomsbury Publishers", 1997, 275, 120, "hard binding"));
        listOfBooks.add(new Book(2411, "Harry Potter and the Deathly Hallows", "J.Rowling", "Bloomsbury Publishers", 2007, 640, 120, "hard binding"));
        return listOfBooks;
    }

}

