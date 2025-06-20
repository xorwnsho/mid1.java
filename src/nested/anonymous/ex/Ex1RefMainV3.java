package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void print(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Process dice = new Dice(){
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + random);
            }
        };

        Process sum = new Sum(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        print(dice);
        print(sum);
    }
}
