package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {
    public void sendMesssage(String data) {
        String address = "https://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } finally {
            client.disconnect();
        }

    }
}
