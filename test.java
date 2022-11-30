import java.sql.*;

public class test {
   private Connection conn;
   private static final String USERNAME = "root";//DBMS접속 시 아이디
    private static final String PASSWORD = "money";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://localhost:3306/dominos";
    
    public test() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
    }
    public void selectOne() {
        String sql = "select * from ed_info where id = 1";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                System.out.println("교육번호: " + rs.getInt("ed_id"));
                System.out.println("수강명칭: " + rs.getString("ed_name"));
                System.out.println("교육대상: " + rs.getString("ed_target"));
                System.out.println("교육기간: " + rs.getString("ed_institution"));
                System.out.println("수강신청기간: " + rs.getString("ed_period"));
            }     
        } catch (Exception e) {
            System.out.println("select 메서드 예외발생");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
}