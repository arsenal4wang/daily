package org.wang.file;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class test {
	public static  int m=100;
	public static void main(String[] args) {
//		m=10;
//		System.out.println(m);
	String string="whatisjava";
//	System.out.println(string.equals("wode"));
	System.out.println("wode".equals(null));
	try {
		MessageDigest md=MessageDigest.getInstance("MD5");
//		md.update(string.getBytes());
		byte [] bytes=md.digest(string.getBytes());
		
		BASE64Encoder bs=new BASE64Encoder();
		System.out.println(bs.encode(bytes).toString());
	} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
	System.out.println("11"+4);
	}
	public static int fun(int i){
		return i*i;
	}
	
}
