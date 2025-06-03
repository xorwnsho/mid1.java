package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

//        if(str.indexOf(ext) != -1){
//            String filename = str.substring(0, str.indexOf(ext));
//            String extName = str.substring(str.indexOf(ext));
//            System.out.println("filename = " + filename);
//            System.out.println("extName = " + extName);
//        }
        int extIndex = str.indexOf(ext);
        String filename = str.substring(0,extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
