package org.wang.dbDemo;

//���ñ�����Ϊsql������ʽ
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbDelete01 {
	// ����mysql����������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// ����mysql�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	public static void main(String[] args) throws Exception {
		Connection conn = null;// �������ݿ�
		Statement stmt = null;// ���ݿ����
		Class.forName(DBDRIVER);// ������������
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		String sql = "delete from user where id=5";		
		stmt = conn.createStatement();// ʵ����Staement����
		//stmt.executeUpdate(sql);// ִ�����ݿ���²���
	    stmt.execute(sql);
		//stmt.executeUpdate("alter table user AUTO_INCREMENT=1;");
		stmt.close();// �رղ���
		conn.close(); // �ر����ݿ�
		System.out.println("ɾ���ɹ�");
	}
}
