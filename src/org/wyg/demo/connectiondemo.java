package org.wyg.demo;
public class connectiondemo{

//	����mysql�����ݿ���������
	public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
	
	public static void main(String[] args) {
    try {
	     Class.forName(DBDRIVER);//������������
        System.out.println("������������ɹ�");
   } catch (ClassNotFoundException e)
        {	   e.printStackTrace();
        }
	}

}
