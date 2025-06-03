package lang.math.test;

import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] lotto = lottoGenerator.generate();
        System.out.println("lotto = " + Arrays.toString(lotto));
    }
}
