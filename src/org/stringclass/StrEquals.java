package org.stringclass;

public class StrEquals {
	public static void main(String[] args) {
		String str="Hello World1";//ʹ��ֱ�Ӹ�ֵ�ķ�ʽ���и�ֵ
		  String str1=new String("Hello World");//ͨ�����캯����ֵ
		  String str2=str1;
		  System.out.println("str equals str1---->:"+str.equals(str1));
		  System.out.println("str equals str2---->:"+str.equals(str2));
		  System.out.println("str1 equals str2---->:"+str1.equals(str2));
		  System.out.println(str.compareTo(str1));
		  System.out.println(str.charAt(3));	
		  System.out.println("Hello World".equals(str1));
		  
	}
}
