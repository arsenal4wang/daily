package org.stringclass;

public class StrEquals {
	public static void main(String[] args) {
		String str="Hello World1";//使用直接赋值的方式进行赋值
		  String str1=new String("Hello World");//通过构造函数赋值
		  String str2=str1;
		  System.out.println("str equals str1---->:"+str.equals(str1));
		  System.out.println("str equals str2---->:"+str.equals(str2));
		  System.out.println("str1 equals str2---->:"+str1.equals(str2));
		  System.out.println(str.compareTo(str1));
		  System.out.println(str.charAt(3));	
		  System.out.println("Hello World".equals(str1));
		  
	}
}
