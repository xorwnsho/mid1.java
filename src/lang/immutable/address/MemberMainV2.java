package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        System.out.println("mamberA = " + memberA);
        System.out.println("mamberB = " + memberB);

        // 회원B의 주소를 부산으로 변경
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("mamberA = " + memberA);
        System.out.println("mamberB = " + memberB);


    }
}
