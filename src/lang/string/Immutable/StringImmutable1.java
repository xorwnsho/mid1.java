package lang.string.Immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str1= "hello";
        String str2 = new String(str1.concat(" java"));
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
