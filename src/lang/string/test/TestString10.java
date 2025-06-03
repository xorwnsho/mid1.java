package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple, banana, mango";
        String[] fruitArr = fruits.split(", ");
        for (String s : fruitArr) {
            System.out.println(s);
        }
        String joinedString = String.join("->", fruitArr);
        System.out.println("joinedString = " + joinedString);
    }
}
