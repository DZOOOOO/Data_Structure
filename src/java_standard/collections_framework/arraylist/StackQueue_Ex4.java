package java_standard.collections_framework.arraylist;

import java.util.*;

public class StackQueue_Ex4 {
    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    printHelp();
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0; // 순번 보여주는 변수..
                    save(input);
                    queueLoop(i);
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    private static void queueLoop(int i) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(++i + "." + it.next());
        }
    }

    private static void printHelp() {
        System.out.println(" help - 도움말을 보여줍니다.");
        System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
        System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
    }

    static void save(String input) {
        if (!queue.equals("")) {
            queue.offer(input);
        }
        if (queue.size() > MAX_SIZE) {
            queue.poll();
        }
    }

}
