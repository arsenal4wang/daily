package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class dbSelectDemo02 {
	// 定义mysql的驱动程序
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// 定义mysql的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// 连接数据库
		PreparedStatement pstmt = null;
		Class.forName(DBDRIVER);// 加载驱动程序
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
		conn.close(); // 关闭数据库
		// System.out.println("功");
	}
}
