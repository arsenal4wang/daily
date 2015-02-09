package org.wyg.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectiondemo2 {
	
	public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
//	定义MySql数据库的连接地址
	public static final String DBURL="jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER="root";
	public static final String DBPASS="mysqladmin";
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			     Class.forName(DBDRIVER);//加载驱动程序
		        System.out.println("加载驱动程序成功");
		   } catch (ClassNotFoundException e)
		        {	   e.printStackTrace();
		        }				
		Connection con=null;
     try {
		con=DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	} catch (SQLException e) {
		e.printStackTrace();
	}
     System.out.println(con);//如果此时可以打印，表示连接正常
     try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
