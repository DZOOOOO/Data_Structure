package dataStructure.basicMath;

import java.util.ArrayList;

public class Gong {
    // 약수 구하기
    public ArrayList<Integer> getDivisor(int num) {
        ArrayList<Integer> result = new ArrayList();
        // 수의 절반 까지는 나누어 떨어진다. 하지만 절반 이상이 되면 나누어 떨어지는 경우가 없다.
        for (int i = 1; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    // 최대 공약수
    public int getGCD(int numA, int numB) {
        int gcd = -1;
        ArrayList<Integer> divisorA = this.getDivisor(numA);
        ArrayList<Integer> divisorB = this.getDivisor(numB);
        for (int itemA : divisorA) {
            for (int itemB : divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    // 최소 공배수
    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = this.getGCD(numA, numB);
        if (gcd != -1) {
            // 최소 공배수는 두 수를 곱하고 최대 공약수로 나눠 주면 된다.
            lcm = numA * numB / gcd;
        }
        return lcm;
    }
}