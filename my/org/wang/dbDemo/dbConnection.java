package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) {
		Connection conn=null;	
		try {
			Class.forName(DBDRIVER);//������������
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);//�������ݿ�
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			conn.close();//�ر����ݿ�
			System.out.println("���ӳɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
