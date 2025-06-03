package enumeration.test.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
//
        scan();
    }

    public static void printAuth(AuthGrade authGrade){
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", description=" + authGrade.getDescription());
    }

    public static void scan(){
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(AuthGrade.values()) + ": ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " +  authGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        if(authGrade.getLevel() > 0){
            System.out.println("- 메인 화면");
        }
        if(authGrade.getLevel() > 1){
            System.out.println("- 이메일 관리 화면");
        }
        if(authGrade.getLevel() > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
