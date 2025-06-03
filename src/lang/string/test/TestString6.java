package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;

        String[] arr = str.split(" |, ");
        for (String s : arr) {
            if(s.equals(key)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
