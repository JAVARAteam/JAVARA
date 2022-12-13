package Workable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WelfareDB {
	private Connection conn;
	private static final String USERNAME = "root";//DBMS접속 시 아이디
    private static final String PASSWORD = "1234";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://localhost:3306/workable";
    
    public WelfareDB() {
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
        String sql = "select * from welfare where 연번 = 1";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                System.out.println("연번: " + rs.getInt("연번"));
                System.out.println("제공기관명: " + rs.getString("제공기관명"));
                System.out.println("주소: " + rs.getString("주소"));
                System.out.println("건강및안전: " + rs.getString("건강및안전"));
                System.out.println("고용: " + rs.getString("고용"));
                System.out.println("교육: " + rs.getString("교육"));
                System.out.println("기타: " + rs.getString("기타"));
                System.out.println("여가활동: " + rs.getString("여가활용"));
                System.out.println("재활및발달: " + rs.getString("재활및발달"));
                System.out.println("정보제공: " + rs.getString("정보제공"));
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