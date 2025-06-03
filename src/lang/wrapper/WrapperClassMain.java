package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(100.0);

        System.out.println("integer = " + integer);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("비교");
        System.out.println("integer == integerObj : " + (integer == integerObj));
        System.out.println("integer.equals(integerObj) : " + integer.equals(integerObj));
    }
}
