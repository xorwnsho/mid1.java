package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;
        class LocalPrint{
            int value = 0;

            public void printDate(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrint print = new LocalPrint();
        print.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 outer = new LocalOuterV1();
        outer.process(2);
    }
}
