package org.wang.mianshi;

import java.util.ArrayList;

public class ip {

	public static void main(String[] args) {
		
//		int i=Integer.parseInt("10");
		long m=10<<8;
		String string="10.10.0.1";
		String sips[]=string.split("\\.");
		long ips=0L;
		  for (int i = 0; i < 4; ++i) {  
			  System.out.println(sips[i]);
	             ips = ips << 8 | Integer.parseInt(sips[i]);//转换为32位的数
	             System.out.println(ips);
		  }
		  System.out.println("**********");
		  System.out.println(Integer.parseInt(sips[0])*256*256*256+Integer.parseInt(sips[0])*256*256+Integer.parseInt(sips[0])*256+Integer.parseInt(sips[0]));
	}

}
