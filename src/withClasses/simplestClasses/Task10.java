package withClasses.simplestClasses;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие:\n1.Список рейсов для заданного пункта назначения" +
                    "                             \n2.Список рейсов для заданного дня недели" +
                    "                             \n3.Список рейсов для заданного дня недели, время вылета для которых больше заданного" +
                    "                             \n4.Выход" +
                    "                             \n...");
            Scanner scanner = new Scanner(System.in);
            try {
                int key = scanner.nextInt();
                switch (key) {
                    case (1):
                        printTheListOfAirlineByDestination();
                        break;
                    case (2):
                        printTheListOfAirlineByDay();;
                        break;
                    case (3):
                        printTheListOfAirlineByDayAndTime();
                        break;
                    case (4):
                        System.out.println("Работа программы завершена");
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

    private static void printTheListOfAirlineByDayAndTime() {
        System.out.println("Введите день недели:");
        Scanner scanner = new Scanner(System.in);
        try {
            String day = scanner.nextLine();
            ListOfAirline list = new ListOfAirline();
            ArrayList<Airline> listLine = list.getList();
            for (Airline line :
                    listLine) {
                if (day.equalsIgnoreCase(line.getDayOfWeek())
                        || line.getDayOfWeek().toLowerCase(Locale.ROOT).contains(day.toLowerCase(Locale.ROOT))) {
                    System.out.println("Часы: ");
                    int hour = scanner.nextInt();
                    System.out.println("Минуты: ");
                    int min = scanner.nextInt();
                    if(hour< line.getTime().getHours() ||
                            (hour==line.getTime().getHours() && min < line.getTime().getMinutes())){
                        System.out.println(line);
                        break;
                    }else{
                        System.out.println("После заданного времени рейсов нет");
                        break;
                    }
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }

    private static void printTheListOfAirlineByDay() {
        System.out.println("Введите день недели:");
        Scanner scanner = new Scanner(System.in);
        try {
            String day = scanner.nextLine();
            ListOfAirline list = new ListOfAirline();
            ArrayList<Airline> listLine = list.getList();
            for (Airline line :
                    listLine) {
                if (day.equalsIgnoreCase(line.getDayOfWeek())
                        || line.getDayOfWeek().toLowerCase(Locale.ROOT).contains(day.toLowerCase(Locale.ROOT))) {
                    System.out.println(line);
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }

    private static void printTheListOfAirlineByDestination() {
        System.out.println("Введите пункт назначения:");
        Scanner scanner = new Scanner(System.in);
        try {
            String destination = scanner.nextLine();
            ListOfAirline list = new ListOfAirline();
            ArrayList<Airline> listLine = list.getList();
            for (Airline line :
                    listLine) {
                if (destination.equalsIgnoreCase(line.getDestination())
                        || line.getDestination().toLowerCase(Locale.ROOT).contains(destination.toLowerCase(Locale.ROOT))) {
                    System.out.println(line);
                }else{
                    System.out.println("                                        В "+destination+" рейсов нет )))");
                    break;
                }
            }
        } catch (Throwable throwable) {
            System.out.println("");
        }
    }
}
class Airline{
    private final String destination;
    private final StartTime time;
    private final String dayOfWeek;

    public Airline(String destination, int number, String typeOfPlane, StartTime time, String dayOfWeek) {
        this.destination = destination;
        // long-haul
        this.time = time;
        this.dayOfWeek = dayOfWeek;
    }

    public StartTime getTime() {
        return time;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return getDestination()+" \n"+ getTime()+getDayOfWeek()+"\n-----------------";
    }

    public String getDestination() {
        return destination;
    }
}
class StartTime {
    private final int hours;
    private final int minutes;

    public StartTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return String.format("[%2s:%2s]",getHours(),getMinutes());
    }
}
class ListOfAirline{

    public ArrayList<Airline> getList(){
        ArrayList list = new ArrayList<>();
        list.add(new Airline("Minsk", 111, "short-haul",new StartTime(12,30),"Monday"));
        list.add(new Airline("Grodno", 222, "short-haul",new StartTime(10,30),"Tuesday"));
        list.add(new Airline("Homel", 333, "short-haul",new StartTime(14,40),"Wednesday"));
        list.add(new Airline("Moscow", 444, "medium-haul",new StartTime(9,20),"Thursdays"));
        list.add(new Airline("Vilnus", 555, "short-haul",new StartTime(3,35),"Wednesday"));
        list.add(new Airline("London", 666, "long-haul",new StartTime(18,50),"Sunday"));
        list.add(new Airline("New York", 777, "long-haul",new StartTime(23,0),"Saturday"));
        list.add(new Airline("Barcelona", 888, "long-haul",new StartTime(12,30),"Friday"));
    return list;
    }
}
