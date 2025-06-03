package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        System.out.println("mamberA = " + memberA);
        System.out.println("mamberB = " + memberB);

        // 회원B의 주소를 부산으로 변경
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("mamberA = " + memberA);
        System.out.println("mamberB = " + memberB);


    }
}
