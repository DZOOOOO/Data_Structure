package javaBasic.scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // (비효율 적인 메모리 사용 + 코드 복잡성 높아짐) --> if문 안에 사용하는 것이 효율적..!
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}