package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	// 定义mysql的驱动程序
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) {
		Connection conn=null;	
		try {
			Class.forName(DBDRIVER);//加载驱动程序
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);//连接数据库
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			conn.close();//关闭数据库
			System.out.println("连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
