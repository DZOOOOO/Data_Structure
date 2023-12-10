package javaBasic.method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(5);
        System.out.println("2. changeNumber 호출 전, num1: " + num1);
    }

    // 변수의 값을 복사해서 주는 것이기 때문에 변수끼리는 독립된 별도의 존재 영향을 주지 않는다...!
    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}