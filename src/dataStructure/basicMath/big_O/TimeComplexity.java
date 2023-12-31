package dataStructure.basicMath.big_O;

public class TimeComplexity {

    static int fibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // 시간 복잡도
        System.out.println("== 시간 복잡도 ==");

        // O(1)
        System.out.println("== O(1) ==");
        System.out.println("hello");

        // O(logN)
        System.out.println("== O(logN) ==");
        for (int i = 1; i < 16; i += 2) {
            System.out.println("hello");
        }

        // O(N)
        System.out.println("== O(N) ==");
        for (int i = 0; i < 2; i++) {
            System.out.println("hello");
        }

        // O(NlogN)
        System.out.println("== O(NlogN) ==");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 8; j +=2) {
                System.out.println("hello");
            }
        }

        // O(N^2)
        System.out.println("== O(N^2) ==");
        // 피보나치 재귀
        System.out.println(fibonacci(6));

        // 공간 복잡도
        System.out.println("== 공간 복잡도 ==");

        // O(N)
        System.out.println("== O(N) ==");
        int n = 3;
        System.out.println(factorial(3));

        // O(1)
        System.out.println("== O(1) ==");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= 1;
        }
        System.out.println(result);
    }


}
