package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMesssage(String data){
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
