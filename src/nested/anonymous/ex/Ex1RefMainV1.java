package nested.anonymous.ex;

public class Ex1RefMainV1 {


    public static void main(String[] args) {
        print(new Dice());
        print(new Sum());
    }
    public static void print(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }
}
