package org.wang.dbDemo;
public class dbDriveDemo {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);//������������
			System.out.println("���سɹ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
