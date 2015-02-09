package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbSelectDemo01 {
	// 定义mysql的驱动程序
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// 定义mysql的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// 连接数据库
		Statement stmt = null;// 数据库操作
		ResultSet rs = null;// 声明一个resultSet对象
		Class.forName(DBDRIVER);// 加载驱动程序
		String sql = "select * from user";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// 实例化Staement对象
		rs = stmt.executeQuery(sql);// 执行数据库更新操作
		// stmt.executeUpdate("alter table user AUTO_INCREMENT=1;");
		System.out.print("编号\t姓名\t密码\t年龄\t性别\t生日\n");
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
		stmt.close();// 关闭操作
		conn.close(); // 关闭数据库
		System.out.println("显示成功");
	}
}
