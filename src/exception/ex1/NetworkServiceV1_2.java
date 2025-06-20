package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMesssage(String data){
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }
        client.disconnect();
    }

    public boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
