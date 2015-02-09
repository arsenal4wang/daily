package org.wang.dbDemo;
public class dbDriveDemo {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);//加载驱动程序
			System.out.println("加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
