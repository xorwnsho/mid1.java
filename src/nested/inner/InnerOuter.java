package nested.inner;

public class InnerOuter {
    private static int coutClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;
        public void print(){
            System.out.println(innerInstanceValue);
            System.out.println(outInstanceValue);
            System.out.println(coutClassValue);
        }
    }
}
