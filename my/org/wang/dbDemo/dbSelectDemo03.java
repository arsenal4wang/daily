package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class dbSelectDemo03 {
	// ����mysql����������
//	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		PreparedStatement pstmt = null;
		Class.forName(DBDRIVER);// ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		String sql="select count(*) from users where name=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "ϰ��ƽ");
		ResultSet rs=pstmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
		rs.close();
		pstmt.close();
		conn.close(); // �ر����ݿ�
		// System.out.println("��");
	}
}
