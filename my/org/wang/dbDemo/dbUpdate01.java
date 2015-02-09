package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbUpdate01 {
	// 定义mysql的驱动程序
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// 定义mysql的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;// 连接数据库
		Statement stmt = null;// 数据库操作
		Class.forName(DBDRIVER);// 加载驱动程序
		String name = "李克强";
		String password = "wang";
		int age = 22;
		String sex = "男";
		String birthday = "1960-6-18";
		String sql = "update user set name='" + name + "',password='"
				+ password + "',age=" + age + ",sex='" + sex + "',birthday='"
				+ birthday + "' where id=3;";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// 实例化Staement对象
		stmt.executeUpdate(sql);// 执行数据库更新操作
		// stmt.executeUpdate("alter table user AUTO_INCREMENT=1;");
		stmt.close();// 关闭操作
		conn.close(); // 关闭数据库
		System.out.println("更改成功");
	}
}
