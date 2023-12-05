package dataStructure.basicMath;

import java.util.ArrayList;

public class MySet {
    ArrayList<Integer> list;

    // 생성자1
    public MySet() {
        this.list = new ArrayList<>();
    }

    // 생성자2
    public MySet(int[] arr) {
        this.list = new ArrayList<>();
        for (int item : arr) {
            this.list.add(item);
        }
    }

    // 원소 추가 (중복 X)
    public void add(int x) {
        // 중복되는 원소인지 체크해준다.
        for (int item : this.list) {
            if (item == x) {
                return;
            }
        }
        // 중복이 안되는 경우면 추가
        this.list.add(x);
    }

    // 교집합 -> 두 집합이 공통으로 포함하는 원소로 이루어진 집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            for (int itemB : b.list) {
                // 같은 경우만 리스트에 넣어준다.
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }

    // 합집합 --> 어느 하나라도 속하는 원소들의 모두 모은 집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            result.add(itemA);
        }
        for (int itemB : b.list) {
            result.add(itemB);
        }
        return result;
    }

    // 차집합 --> A(or B)에만 속하는 원소들의 집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            boolean containFlag = false;
            for (int itemB : b.list) {
                // 원소가 같은 경우를 걸러 준다.
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            // 원소가 같지 않은 경우만 리스트에 넣어준다.
            if (!containFlag) {
                result.add(itemA);
            }
        }
        return result;
    }
}
