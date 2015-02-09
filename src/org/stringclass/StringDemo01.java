package org.stringclass;
public class StringDemo01 {
  public static void main(String args[]){
	  String str="hello world";//使用直接赋值的方式进行赋值
	  String str1=new String("Hello World");//通过构造函数赋值
	  String str2=str1;
	  System.out.println("str==str1---->:"+(str==str1));
	  System.out.println("str==str2---->:"+(str==str2));
	  System.out.println("str1==str2---->:"+(str1==str2));
 }
}
