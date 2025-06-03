package lang.string.method;

public class StringComparisMain {
    public static void main(String[] args) {
        String str1 = "Hello, java!";
        String str2 = "hello, Java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 eqaulsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a' : " + "c".compareTo("a"));

        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello' :" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'java!' :" + str1.endsWith("java!"));

    }
}
