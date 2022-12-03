package workable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ed_info {
	private Connection conn;
	private static final String USERNAME = "root";// DBMS���� �� ���̵�
	private static final String PASSWORD = "1234";// DBMS���� �� ��й�ȣ
	private static final String URL = "jdbc:mysql://localhost:3306/workabledb";

	public ed_info() {
		try {
			System.out.println("������");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("����̹� �ε� ����");
		} catch (Exception e) {
			System.out.println("����̹� �ε� ���� ");
			try {
				conn.close();
			} catch (SQLException e1) {
			}
		}
	}

	public void selectOne() {
		String sql = "select * from ed_info where ed_id = 4";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("ed_id: " + rs.getInt("ed_id"));
				System.out.println("ed_name: " + rs.getString("ed_name"));
				System.out.println("ed_target: " + rs.getString("ed_target"));
				System.out.println("ed_instituition: " + rs.getString("ed_institution"));
				System.out.println("ed_period: " + rs.getString("ed_period"));
			}
		} catch (Exception e) {
			System.out.println("select �޼��� ���ܹ߻�");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
	}
}
