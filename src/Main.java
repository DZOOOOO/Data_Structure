import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[]{
                        ".xx...xx.",
                        "x..x.x..x",
                        "x...x...x",
                        ".x.....x.",
                        "..x...x..",
                        "...x.x...",
                        "....x...."},
                2)));
    }
}

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String[] result = new String[picture.length * k];

        // 1. 가로로 k배
        for (String str : picture) {
            char[] newStr = str.toCharArray();
            String kStr = "";
            for (char c : newStr) {
                for (int j = 0; j < k; j++) {
                    kStr += c;
                }
            }
            list.add(kStr);
        }

        // 2. 세로로 k배
        for (String str : list) {
            for(int i = 0; i < k; i++) {
                list2.add(str);
            }
        }

        // 3. 최종 배열에 담기
        for (int i = 0; i < list2.size(); i++) {
            result[i] = list2.get(i);
        }

        return result;
    }
}