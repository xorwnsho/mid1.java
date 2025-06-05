package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간 : " + seoulTime);

        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간 : " + londonTime);

        ZonedDateTime newyorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간 : " + newyorkTime);

    }
}
