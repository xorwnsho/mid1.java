package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 service = new NetworkServiceV0();

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
