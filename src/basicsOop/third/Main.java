package basicsOop.third;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Main {
    public static void main(String[] args) {
        Calendar myCalendar = new Calendar();
        myCalendar.addHoliday(MonthDay.of(1, 7));
        myCalendar.addHoliday(MonthDay.of(Month.FEBRUARY, 10));
        myCalendar.addHoliday(MonthDay.of(3, 8));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, Month.MARCH, 6));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, 3, 7));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, Month.MARCH, 8));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, 3, 9));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, 2, 9));
        Calendar.Holiday.isItHoliday(LocalDate.of(2021, 2, 10));
    }
}
