package org.wyg.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectiondemo2 {
	
	public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
//	����MySql���ݿ�����ӵ�ַ
	public static final String DBURL="jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER="root";
	public static final String DBPASS="mysqladmin";
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			     Class.forName(DBDRIVER);//������������
		        System.out.println("������������ɹ�");
		   } catch (ClassNotFoundException e)
		        {	   e.printStackTrace();
		        }				
		Connection con=null;
     try {
		con=DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	} catch (SQLException e) {
		e.printStackTrace();
	}
     System.out.println(con);//�����ʱ���Դ�ӡ����ʾ��������
     try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
