package dataStructure.basicMath;

public class Recurrence {

    static int recursion1(int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursion1(n - 1);
    }

    static int recursion2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursion2(n - 1);
    }

    static int recursion3(int n) {
        if (n < 3) {
            return 1;
        }
        return recursion3(n - 2) + recursion3(n - 1);
    }

    public static void main(String[] args) {
        // 점화식 -> 어떤 수열의 일반항을 그 이전의 항들을 이용하여 정의한 식 ex) 피보나치 수열
        // 재귀함수 -> 어떤 함수가 자신을 다시 호출하여 작업을 수행하는 방식

        System.out.println("== 점화식/재귀함수 연습1 ==");
        // 1, 3, 9, 27, .... 의 n번째 수
        int n = 4;
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result *= 3;
            }
        }
        System.out.println(result);
        System.out.println("recursion1(n) => " + recursion1(n));

        System.out.println("== 점화식/재귀함수 연습2 ==");
        // 1, 2, 3, 4, 5, 6, ... 의 n번째 까지의 합
        n = 5;
        result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
        System.out.println("recursion2(n) => " + recursion2(n));


        System.out.println("== 점화식/재귀함수 연습3 ==");
        // 1, 1, 2, 3, 5, 8, 13, ... 의 n번 째 수
        n = 6;
        result = 0;
        int a1 = 1;
        int a2 = 1;

        // 3번째 항 미만의 값은 1;
        if (n < 3) {
            result = 1;
        } else {
            // 3번째 항 이상이면 2부터 값이 시작
            for (int i = 3; i <= n; i++) {
                result = a1 + a2; // result = 2; --> 3번째 항의 값
                a1 = a2; // a1 = 1;
                a2 = result; // a2 = 2;
                // 한칸씩 값을 이동시키면서 반복을 돌린다.
            }
        }
        System.out.println(result);
        System.out.println("recursion3(n) => " + recursion3(n));
    }
}
