package nested.anonymous.ex;

import java.util.Random;

public class Dice implements Process{
    @Override
    public void run() {
        int random = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + random);
    }
}
