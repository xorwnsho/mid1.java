package exception.basic.uncheckedException;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
