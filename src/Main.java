import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 합의 법칙 -> 사건A 또는 사건B 가 일어날 경우의 수
        System.out.println("== 합의 법칙 ==");

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        // 두 개의 주사위를 던졌을 때 합이 3 또는 4의 배수인 경우의 수
        for (int i : dice1) {
            for (int j : dice2) {
                if ((i + j) % 3 == 0) {
                    nA += 1;
                } else if ((i + j) % 4 == 0) {
                    nB += 1;
                } else if ((i + j) % 12 == 0) {
                    nAandB += 1;
                }
            }
        }

        System.out.println(nA + nB - nAandB);

        // HashSet 이용
        HashSet<ArrayList> allCase = new HashSet<>();
        for (int item1 : dice1) {
            for (int item2 : dice2) {
                if ((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list);
                }
            }
        }
        System.out.println(allCase.size());


        // 곱의 법칙 -> 사건A와 사건B가 동시에 일어날 경우의 수
        System.out.println("== 곱의 법칙 ==");

        // 두 개의 주사위 a,b를 던겼을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        nA = 0;
        nB = 0;

        for (int item1 : dice1) {
            if (item1 % 3 == 0) {
                nA += 1;
            }
        }

        for (int item2 : dice2) {
            if (item2 % 4 == 0) {
                nB += 1;
            }
        }

        System.out.println("결과: " + (nA * nB));
    }
}

// 경우의 수 -> 어떤 사건에서 일어날 수 있는 경우의 가짓수



