package Workable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ed_info {
	
   private Connection conn;
   private static final String USERNAME = "root";// DBMS접속 시 아이디
   private static final String PASSWORD = "1234";// DBMS접속 시 비밀번호
   private static final String URL = "jdbc:mysql://localhost:3306/workable";

   
 
   public ed_info() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      } catch (Exception e) {
         System.out.println("드라이버 로딩 실패 ");
         try {
            conn.close();
         } catch (SQLException e1) {
         }
      }
      
   }

   public ArrayList<ed_idinfo> selectOne() {
      String sql = "select * from ed_info";
      
      ArrayList<ed_idinfo> edid = new ArrayList<>();
      PreparedStatement pstmt = null;
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         while (rs.next()) {
        	 ed_idinfo ed = new ed_idinfo();
        	 ed.setEd_Id(rs.getInt("ed_id"));
        	 ed.setEd_Name(rs.getString("ed_name"));
        	 ed.seted_target(rs.getString("ed_target"));
        	 ed.setEd_Period(rs.getString("ed_period"));
        	 ed.setEd_Institution(rs.getString("ed_institution"));
        	 edid.add(ed);
         }
         
      } catch (Exception e) {
         System.out.println("select 메서드 예외발생");
      } finally {
         try {
            if (pstmt != null && !pstmt.isClosed()) {
               pstmt.close();
            }
         } catch (Exception e2) {
         }
      }
	return edid;
   }
}
