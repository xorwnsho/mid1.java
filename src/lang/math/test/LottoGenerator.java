package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] numbers;
    private int count;


    public int[] generate() {
        count = 0;
        numbers = new int[6];
        while (count < 6) {
            int randomInt = random.nextInt(45) + 1;
            if (isUnique(randomInt)) {
                numbers[count] = randomInt;
                count++;
            }
        }
        return numbers;
    }

    public boolean isUnique(int randomInt) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == randomInt) {
                return false;
            }
        }
        return true;
    }
}