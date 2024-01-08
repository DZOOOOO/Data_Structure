package java_standard.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayList_Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(0);
        list.add(11);

        ArrayList<Integer> list2 = new ArrayList<>(list.subList(1, 4));
        print(list, list2);


    }

    public static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
