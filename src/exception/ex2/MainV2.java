package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV1_1 service = new NetworkServiceV1_1();
//        NetworkServiceV1_2 service = new NetworkServiceV1_2();
//        NetworkServiceV2_1 service = new NetworkServiceV2_1();
//        NetworkServiceV2_2 service = new NetworkServiceV2_2();
//        NetworkServiceV2_3 service = new NetworkServiceV2_3();
//        NetworkServiceV2_4 service = new NetworkServiceV2_4();
        NetworkServiceV2_5 service = new NetworkServiceV2_5();

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
