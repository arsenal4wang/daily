package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbUpdate01 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		Statement stmt = null;// ���ݿ����
		Class.forName(DBDRIVER);// ������������
		String name = "���ǿ";
		String password = "wang";
		int age = 22;
		String sex = "��";
		String birthday = "1960-6-18";
		String sql = "update user set name='" + name + "',password='"
				+ password + "',age=" + age + ",sex='" + sex + "',birthday='"
				+ birthday + "' where id=3;";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// ʵ����Staement����
		stmt.executeUpdate(sql);// ִ�����ݿ���²���
		// stmt.executeUpdate("alter table user AUTO_INCREMENT=1;");
		stmt.close();// �رղ���
		conn.close(); // �ر����ݿ�
		System.out.println("���ĳɹ�");
	}
}
