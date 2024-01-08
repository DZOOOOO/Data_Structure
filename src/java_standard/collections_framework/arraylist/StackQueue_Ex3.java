package java_standard.collections_framework.arraylist;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueue_Ex3 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String expression = args[0];

        System.out.println("expression : " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    // 문자열로 변환 후 스택에 삽입
                    stack.push(ch + "");
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }

        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
