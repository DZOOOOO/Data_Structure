package java_standard.collections_framework.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ID 입력 : ");
            String id = scanner.nextLine().trim();
            System.out.println("PW 입력 : ");
            String pw = scanner.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("아이디가 없습니다.");
                continue;
            }

            if (!(map.get(id)).equals(pw)) {
                System.out.println("비밀번호가 틀렸습니다.");
            } else {
                System.out.println("로그인..!");
                break;
            }
        }
    }
}
