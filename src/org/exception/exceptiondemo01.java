package org.exception;

public class exceptiondemo01 {

	public static void main(String[] args) {
          int i=10;
          int j=0;
       try{
    		   int temp=i/j;
    		   System.out.println("��������Ľ��Ϊ"+ temp);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("�����쳣"+e);
       
	}
       finally {
    	 System.out.println("����ִ���Ĳ��֣��˲��ֶ�ִ��");
       }
	
	}
}
