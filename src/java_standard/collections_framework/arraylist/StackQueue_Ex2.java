package java_standard.collections_framework.arraylist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue_Ex2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);


    }
}
