package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        //valueOf는 래퍼 타입을 반환
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");

        //parseInt는 기본형을 반환
        int intValue = Integer.parseInt("10");
    }
}
