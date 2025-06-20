package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 service = new NetworkServiceV1_1();
//        NetworkServiceV1_2 service = new NetworkServiceV1_2();
        NetworkServiceV1_3 service = new NetworkServiceV1_3();

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
