package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행시간 : " + (endTime - startTime) + "ms");

        // 래퍼 클래스 사용하여 시간 계신
        // 자바에서 객체 자체를 다루어야 하므로 더 많은 메모리를 사용. 더 오래 걸
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행시간 : " + (endTime - startTime) + "ms");
    }
}
