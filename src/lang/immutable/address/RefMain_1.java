package lang.immutable.address;

public class RefMain_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("서울 -> 부산");
        System.out.println("a = " + a);  // Side Effect
        System.out.println("b = " + b);
    }
}
