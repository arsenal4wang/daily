package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbSelectDemo01 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		Statement stmt = null;// ���ݿ����
		ResultSet rs = null;// ����һ��resultSet����
		Class.forName(DBDRIVER);// ������������
		String sql = "select * from user";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// ʵ����Staement����
		rs = stmt.executeQuery(sql);// ִ�����ݿ���²���
		// stmt.executeUpdate("alter table user AUTO_INCREMENT=1;");
		System.out.print("���\t����\t����\t����\t�Ա�\t����\n");
		while (rs.next()){
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
		stmt.close();// �رղ���
		conn.close(); // �ر����ݿ�
		System.out.println("��ʾ�ɹ�");
	}
}
