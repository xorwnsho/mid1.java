package exception.basic.uncheckedException;

public class Service {
    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        } catch(MyUncheckedException e){
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    public void callThrow(){
        client.call();
    }
}
