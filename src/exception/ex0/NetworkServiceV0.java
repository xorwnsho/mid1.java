package exception.ex0;

public class NetworkServiceV0 {
    public void sendMesssage(String data){
        String address = "https://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
