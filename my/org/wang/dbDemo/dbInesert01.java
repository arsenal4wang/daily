package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbInesert01 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	/*
	 * INSERT INTO user(name,password,age,sex,birthday) VALUES
	 * ('���˻�','www.mldn.cn',30,'��','2008-08-27') ; INSERT INTO
	 * user(name,password,age,sex,birthday) VALUES
	 * ('�','www.mldnjava.cn',23,'Ů','2005-08-27') ;
	 */
	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		Statement stmt = null;// ���ݿ����
		Class.forName(DBDRIVER);// ������������
		String sql = "INSERT INTO user(name,password,age,sex,birthday)"
				+ " VALUES ('��ҫ��','wang',23,'��','1989-11-6');";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// ʵ����Staement����
		stmt.executeUpdate(sql);//ִ�����ݿ���²���
		stmt.close();//�رղ���
		conn.close(); // �ر����ݿ�
		System.out.println("����ɹ�");
	}
}
