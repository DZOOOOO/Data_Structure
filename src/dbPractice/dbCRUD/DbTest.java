package dbPractice.dbCRUD;

import java.sql.*;

public class DbTest {
    public static void main(String[] args) {
        
    }

    public static void dbSelect() {
        String url = "jdbc:mysql://localhost:3306/test";
        String dbUserId = "root";
        String dbPassword = "비밀번호";

        try {
            // 1. 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. DB 연결에 필요한 객체 생성
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        // 3. 쿼리 실행
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            String sql = "select member_type, user_id, password, name from member";
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            if (connection != null) {
                System.out.println("DB 연결 성공");
            }

            // 4. 결과 수행
            while (rs.next()) {
                String memberType = rs.getString("member_type");
                String user_id = rs.getString("user_id");
                String password = rs.getString("password");
                String name = rs.getString("name");
                System.out.println(memberType + ", " + user_id + ", " + password + ", " + name);
            }
        } catch (SQLException e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        } finally {
            // 5. 객체 연결 해재 (close)
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbInsert(Member member) {
        String url = "jdbc:mysql://localhost:3306/test";
        String dbUserId = "root";
        String dbPassword = "비밀번호";
        try {
            // 1. 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. DB 연결에 필요한 객체 생성
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        // 3. 쿼리 실행
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);

            String sql = "INSERT INTO member (member_type, user_id, password, name) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, member.getMemberType());
            preparedStatement.setString(2, member.getUserId());
            preparedStatement.setString(3, member.getPassword());
            preparedStatement.setString(4, member.getName());

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("저장 성공");
            } else {
                System.out.println("저장 실패");
            }


        } catch (SQLException e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        } finally {
            // 5. 객체 연결 해재 (close)
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbUpdate() {
        String url = "jdbc:mysql://localhost:3306/test";
        String dbUserId = "root";
        String dbPassword = "비밀번호";
        try {
            // 1. 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. DB 연결에 필요한 객체 생성
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String memberTypeValue = "email";
        String userIdValue = "zerobase@naver.com";
        String password = "9999";


        // 3. 쿼리 실행
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            String sql = "UPDATE member SET password = ? where member_type = ? and user_id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, memberTypeValue);
            preparedStatement.setString(3, userIdValue);

            int affected = preparedStatement.executeUpdate();


            if (affected > 0) {
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }

        } catch (SQLException e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        } finally {
            // 5. 객체 연결 해재 (close)
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbDelete() {
        String url = "jdbc:mysql://localhost:3306/test";
        String dbUserId = "root";
        String dbPassword = "비밀번호";
        try {
            // 1. 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. DB 연결에 필요한 객체 생성
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String memberTypeValue = "email";
        String userIdValue = "zerobase@naver.com";


        // 3. 쿼리 실행
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            String sql = "DELETE from member where member_type = ? and user_id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberTypeValue);
            preparedStatement.setString(2, userIdValue);

            int affected = preparedStatement.executeUpdate();


            if (affected > 0) {
                System.out.println("삭제 완료");
            } else {
                System.out.println("삭제 실패");
            }

        } catch (SQLException e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        } finally {
            // 5. 객체 연결 해재 (close)
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
