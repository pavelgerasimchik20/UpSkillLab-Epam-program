package basicsOop.third;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;

public class Calendar {
    private static HashSet<MonthDay> holidays = new HashSet<>();
    Holiday holiday;

    public Calendar() {
        this.holiday = new Holiday();
    }

    public void addHoliday(MonthDay day) {
        holidays.add(day);
    }

    static class Holiday {

        public static boolean isItWeekend(LocalDate date) {
            DayOfWeek day = date.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println(date + " = Weekend");
                return true;
            } else {
                System.out.println(date + " = Workday");
                return false;
            }
        }

        public static boolean isItHoliday(LocalDate date) {
             if (holidays.contains(MonthDay.of(date.getMonth(), date.getDayOfMonth()))) {
                System.out.println(date + " = Holiday");
                return true;
            }else if (isItWeekend(date)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
