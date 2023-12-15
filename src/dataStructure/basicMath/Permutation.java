package dataStructure.basicMath;

public class Permutation {
    public static void main(String[] args) {
        // 1. 팩토리얼 (Factorial) --> 1에서 n까지 모든 자연수의 곱
        System.out.println("== 팩토리얼 ==");
        // 5!
        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("result = " + result);

        // 2. 순열 (permutation) --> 순서를 정해서 나열, 서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 o, 중복 x)
        System.out.println("== 순열 ==");
        // 5명을 3줄로 세우는 경우의 수
        n = 5;
        int r = 3;
        result = 1;
        for (int i = n; i >= r; i--) {
            result *= i;
        }
        System.out.println("result = " + result);

        // 3. 중복 순열 --> 서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 o, 중복 o)
        System.out.println("== 중복 순열 ==");
        // 서로 다른 4개의 수 중 2개를 뽑는 경우의 수 (중복 허용)
        n = 4;
        r = 2;
        result = 1;
        result = (int) Math.pow(n, 2);
        System.out.println("result = " + result);

        // 4. 원 순열 --> 원 모양의 테이블에 n개의 원소를 나열하는 경우의 수 (n - 1)!
        System.out.println("== 원 순열 ==");
        // 원 모양의 테이블에 3명을 앉히는 경우의 수
        n = 3;
        result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        System.out.println("result = " + result);
    }
}