package nested.anonymous.ex;

public class Sum implements Process{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
