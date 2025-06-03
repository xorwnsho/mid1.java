package lang.object;

public class ObjcetMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        System.out.println(string);
    }
}
