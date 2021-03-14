package basicsOop.third;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Arrays;
import java.util.HashSet;

public class Calendar {
    private static final HashSet<MonthDay> holidays = new HashSet<>();
    Checker checker;

    public Calendar() {
        this.checker = new Checker();
    }

    public void addHoliday(MonthDay... day) {
        holidays.addAll(Arrays.asList(day));
    }

    class Checker {

        public boolean isItWeekend(LocalDate date) {
            DayOfWeek day = date.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println(date + " = Weekend");
                return true;
            } else {
                System.out.println(date + " = Workday");
                return false;
            }
        }

        public void isItHoliday(LocalDate date) {
            if (holidays.contains(MonthDay.of(date.getMonth(), date.getDayOfMonth()))) {
                System.out.println(date + " = Holiday");
            } else {
                isItWeekend(date);
            }
        }
    }
}
