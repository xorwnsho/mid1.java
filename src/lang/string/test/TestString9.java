package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "mt3026super@naver.com";
//        int index = email.indexOf("@");
//        String ID = email.substring(0, index);
//        String domain = email.substring(index + 1);
//        System.out.println("ID = " + ID);
//        System.out.println("domain = " + domain);
        String[] parts = email.split("@");
        String ID = parts[0];
        String domain = parts[1];
        System.out.println("ID = " + ID);
        System.out.println("domain = " + domain);
    }
}
