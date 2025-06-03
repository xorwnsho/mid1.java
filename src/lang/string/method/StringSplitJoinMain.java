package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";
        String[] splitstr = str.split(", ");
        for (String s : splitstr) {
            System.out.println(s);
        }

        String joinStr = "";
        for(String s : splitstr){
            joinStr += s + "-";
        }
        System.out.println("joinStr = " + joinStr);

        String result = String.join("-", splitstr);
        System.out.println("result = " + result);;
    }
}
