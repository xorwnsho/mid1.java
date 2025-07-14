package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 service = new NetworkServiceV4();
        NetworkServiceV5 service = new NetworkServiceV5();

        while(true) {
            System.out.print("전송할 문자 : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equals("exit")) {
                break;
            }

            try{
                service.sendMesssage(input);
            } catch(Exception e) {
                exceptionHandler(e);
            }
        }
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        // 필요하면 별도의 추가 처리
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
