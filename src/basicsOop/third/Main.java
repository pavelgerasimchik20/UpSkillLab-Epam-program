package basicsOop.third;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {
    public static void main(String[] args) {

        Calendar myCalendar = new Calendar();
        myCalendar.addHoliday(
                MonthDay.of(Month.JANUARY, 1),
                MonthDay.of(Month.JANUARY, 7),
                MonthDay.of(Month.MARCH, 8),
                MonthDay.of(Month.MAY, 1),
                MonthDay.of(Month.MAY, 9),
                MonthDay.of(Month.JULY, 3),
                MonthDay.of(Month.SEPTEMBER, 1),
                MonthDay.of(Month.NOVEMBER, 7),
                MonthDay.of(Month.DECEMBER, 25)
        );

        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MARCH, 5));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MARCH, 6));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MARCH, 7));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MARCH, 8));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MAY, 1));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MAY, 2));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MAY, 9));
        myCalendar.checker.isItHoliday(LocalDate.of(2021, Month.MAY, 10));
    }
}
