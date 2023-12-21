package dataStructure.basicMath;

public class ExponentAndLog {

    static double pow(int a, double b) {
        double result = 1;
        boolean isMinus = false;

        if (b == 0) {
            return 1;
        } else if (b < 0) {
            b *= -1;
            isMinus = true;
        }

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return isMinus ? 1 / result : result;
    }

    // 바빌로니아 점화식
    static double sqrt(int a) {
        double result = 1;
        // 반복을 많이 돌릴 수록 근사치를 구할 수 있음.
        for (int i = 0; i < 10; i++) {
            result = (result + (a / result)) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("== 제곱 ==");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -3));
        System.out.println(Math.pow(-2, -3));

        System.out.println("== My pow ==");
        System.out.println(pow(2, 3));
        System.out.println(pow(2, -3));
        System.out.println(pow(-2, -3));

//        System.out.println(Math.pow(2, 30));
//        System.out.printf("%.0f\n", Math.pow(2, 30));

        System.out.println("== 제곱근 ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16, 1.0 / 2));
        System.out.println(Math.pow(16, 1.0 / 4));

        System.out.println("== My Sqrt ==");
        System.out.println(sqrt(16));
        System.out.println(sqrt(8));

        System.out.println("== 절대 값 ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

        System.out.println("== 로그 ==");
        System.out.println(Math.E);
        System.out.println(Math.log(Math.E)); // 밑이 자연상수
        System.out.println(Math.log10(1000));
        System.out.println(Math.log(4) / Math.log(2));

    }

    // 제곱 -> 1. 같은 수를 두 번 곱함, 2. 거듭 제곱 : 같은 수를 거듭하여 곱함

    // 제곱근(=root) -> a를 제곱하여 b가 될 때 a를 b의 제곱근이라고 함
    // 로그 -> a가 b가 되기 위해 제곱해야 하는 수(log a b)

}
