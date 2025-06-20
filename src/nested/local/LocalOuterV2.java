package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        class LocalPrint implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrint print = new LocalPrint();
        print.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 outer = new LocalOuterV2();
        outer.process(2);
    }
}
