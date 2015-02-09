package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class dbSelectDemo03 {
	// 定义mysql的驱动程序
//	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	// 定义mysql的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// 连接数据库
		PreparedStatement pstmt = null;
		Class.forName(DBDRIVER);// 加载驱动程序
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		String sql="select count(*) from users where name=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "习近平");
		ResultSet rs=pstmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
		rs.close();
		pstmt.close();
		conn.close(); // 关闭数据库
		// System.out.println("功");
	}
}
