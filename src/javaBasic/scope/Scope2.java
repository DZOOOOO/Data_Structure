package javaBasic.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능 --> m 접근가능
            System.out.println("for i = " + i);
        } // i 생존 종료
         //  System.out.println("main i = " + i); --> i 변수가 죽었기 때문에 컴파일 오류가 난다.
        System.out.println("main m = " + m);
    }
}