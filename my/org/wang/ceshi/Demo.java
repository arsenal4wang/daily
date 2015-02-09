package org.wang.ceshi;

public class Demo {

	public static void main(String[] args) {
		byte[] b="ABghijklmnop".getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}
	}
}
