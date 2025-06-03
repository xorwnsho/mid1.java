package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱
        // 컴파일 단계에서 Integer boxedValue = Integer.valueOf(value);를 자동 추가

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱
        // 컴파일 단계에서 int unboxedValue = boxedValue.intValue(); 자동 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
