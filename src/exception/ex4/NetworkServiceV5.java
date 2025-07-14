package exception.ex4;

public class NetworkServiceV5 {
    public void sendMesssage(String data) throws Exception {
        String address = "https://example.com";
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;

        }
    }
}
