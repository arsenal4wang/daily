package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;


public class dbUpdate02 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
	    PreparedStatement pstmt=null;	    
		Class.forName(DBDRIVER);// ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		String name = "�Ÿ���";
		String password = "zhang";
		int age = 30;
		String sex = "��";
		/*
		 * ��java.utl.Date���͵�����ת���� java.sql.Date���͵�����
		 */
		String birthday = "1954-05-23";
		java.util.Date temp=null;
		temp=new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		java.sql.Date bir=new java.sql.Date(temp.getTime());
		
		String sql="insert into user(name,password,age,sex,birthday)values(?,?,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setString(2,password);
		pstmt.setInt(3,age);
		pstmt.setString(4,sex);
		pstmt.setDate(5,bir);	
		pstmt.executeUpdate();
		pstmt.close();
		conn.close(); // �ر����ݿ�
		System.out.println("����ɹ�");
	}
}
