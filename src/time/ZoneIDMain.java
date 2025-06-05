package time;

import java.time.ZoneId;

public class ZoneIDMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoul);
    }
}
