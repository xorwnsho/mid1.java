package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
//        NetworkServiceV3_1 service = new NetworkServiceV3_1();
        NetworkServiceV3_2 service = new NetworkServiceV3_2();

        while(true) {
            System.out.print("전송할 문자 : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equals("exit")) {
                break;
            }

            service.sendMesssage(input);
        }
    }
}
