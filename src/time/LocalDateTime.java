package time;

import java.time.LocalDate;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);

        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("지정 날짜 : "+ ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(1);
        System.out.println("지정 날짜 +10 : "+ ofDate);
    }
}
