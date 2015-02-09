package org.wyg.demo;
public class connectiondemo{

//	定义mysql的数据库驱动程序
	public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
	
	public static void main(String[] args) {
    try {
	     Class.forName(DBDRIVER);//加载驱动程序
        System.out.println("加载驱动程序成功");
   } catch (ClassNotFoundException e)
        {	   e.printStackTrace();
        }
	}

}
