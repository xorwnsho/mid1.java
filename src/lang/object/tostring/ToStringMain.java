package lang.object.tostring;

import org.w3c.dom.ls.LSOutput;

public class ToStringMain {
    public static void main(String[] args) {

        Object object = new Object();
        String string = object.toString();

        System.out.println(string);

        // 사실 printin에는 toString() 함수가 포함되어 있다.
        // 그래서 애초에 객체만 넣어도 그 참조값을 뽑아주는 똑같은 결과가 나오는 것.
        System.out.println(object);
    }
}
