package java_standard.collections_framework.collections;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 X
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // comparable 기준에서 오름차순이 디폴트 --> 양수, 음수면 내림차순
        }
        return -1;
    }
}
