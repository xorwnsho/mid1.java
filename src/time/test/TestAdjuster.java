package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjuster {
    public static void main(String[] args) {
        int year =2024;
        int month = 1;

        LocalDate startDate = LocalDate.of(year,month,1);

        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        DayOfWeek lastDayOfWeek = startDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + dayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
