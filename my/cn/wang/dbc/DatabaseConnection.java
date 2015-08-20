package cn.wang.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	private Connection conn=null;
	public static void main(String[] args){}
	public DatabaseConnection() throws Exception {
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	}

	public Connection getConnection() {
		return this.conn;
	}

	public void Close() throws Exception {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}

}
