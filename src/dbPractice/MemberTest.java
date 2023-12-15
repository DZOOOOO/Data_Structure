package dbPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Member member = new Member();
        MemberService memberService = new MemberService();

        // 회원가입
        boolean result = memberService.register(member);

        // 회원탈퇴
        boolean result2 = memberService.withdraw(member);

        // 회원목록
        List<Member> memberList = memberService.getList();

        // 1. 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String dbUserId = "root";
            String dbPassword = "DB 비밀번호..!";

            Connection con = DriverManager.getConnection(url, dbUserId, dbPassword);
            if (con != null) {
                System.out.println("DB 연결 성공");
            }

            Statement statement = con.createStatement();
            String sql = "select member_type, user_id, password, name from member";

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String memberType = rs.getString("member_type");
                String user_id = rs.getString("user_id");
                String password = rs.getString("password");
                String name = rs.getString("name");
                System.out.println(memberType + ", " + user_id + ", " + password + ", " + name);
            }

            if (!rs.isClosed()) {
                rs.close();
            }

            if (!statement.isClosed()) {
                statement.close();
            }

            if (!con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        }
        // 2. 커낵션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해재(close)
    }
}
