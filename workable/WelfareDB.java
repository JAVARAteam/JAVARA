package workable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WelfareDB {
	private Connection conn;
	private static final String USERNAME = "root";//DBMS���� �� ���̵�
    private static final String PASSWORD = "1234";//DBMS���� �� ��й�ȣ
    private static final String URL = "jdbc:mysql://localhost:3306/workabledb";
    
    public WelfareDB() {
        try {
            System.out.println("������");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("����̹� �ε� ����");
        } catch (Exception e) {
            System.out.println("����̹� �ε� ���� ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
    }
    public void selectOne() {
        String sql = "select * from welfare where ���� = 1";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                System.out.println("����: " + rs.getInt("����"));
                System.out.println("���������: " + rs.getString("���������"));
                System.out.println("�ּ�: " + rs.getString("�ּ�"));
                System.out.println("�ǰ��׾���: " + rs.getString("�ǰ��׾���"));
                System.out.println("����: " + rs.getString("����"));
                System.out.println("���: " + rs.getString("���"));
                System.out.println("����: " + rs.getString("����"));
                System.out.println("��Ÿ: " + rs.getString("��Ÿ"));
                System.out.println("����Ȱ��: " + rs.getString("����Ȱ��"));
                System.out.println("��Ȱ�׹ߴ�: " + rs.getString("��Ȱ�׹ߴ�"));
                System.out.println("��������: " + rs.getString("��������"));
            }     
        } catch (Exception e) {
            System.out.println("select �޼��� ���ܹ߻�");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
}

