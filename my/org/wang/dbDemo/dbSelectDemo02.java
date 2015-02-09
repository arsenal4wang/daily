package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class dbSelectDemo02 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		PreparedStatement pstmt = null;
		Class.forName(DBDRIVER);// ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		ResultSet rs = null;
		String keyWord = "we";
		String sql = "select id,name,password,age,sex,birthday"
				+ " from user where name like ? or password like ? or sex like ?;";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%" + keyWord + "%");
		pstmt.setString(2, "%" + keyWord + "%");
		pstmt.setString(3, "%" + keyWord + "%");
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String passwoerd = rs.getString("password");
			int age = rs.getInt("age");
			String sex = rs.getString("sex");
			java.util.Date d = rs.getDate("birthday");
			System.out.println(id + "\t" + name + "\t" + passwoerd + "\t" + age
					+ "\t" + sex + "\t" + d);
		}
		rs.close();
		pstmt.close();
		conn.close(); // �ر����ݿ�
		// System.out.println("��");
	}
}
