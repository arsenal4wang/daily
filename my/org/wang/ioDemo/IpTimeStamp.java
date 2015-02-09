package org.wang.ioDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IpTimeStamp {
	public static void main(String[] args) {
		System.out.println(new IpTimeStamp("127.11.2.34").getIPTimeRandom()
				.toString());
		System.out.print("*******");
	}

	private String ip = null;
	private SimpleDateFormat sdf = null;

	public IpTimeStamp() {
	}

	public IpTimeStamp(String ip) {
		this.ip = ip;
	}

	public String getIPTimeRandom() {
		StringBuffer buffer = new StringBuffer();
		if (this.ip != null) {
			String s[] = this.ip.split("\\.");
			for (int i = 0; i < s.length; i++) {
				buffer.append(this.addZero(s[i], 3));
			}
		}
		 buffer.append(this.getTime());
		Random random = new Random();
		for (int i = 0; i < 3; ++i) {
			buffer.append(random.nextInt(10));
		}
		return buffer.toString();
	}

	private String getTime() {
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}

	private String addZero(String str, int len) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str);
		while (stringBuffer.length() < len) {
			stringBuffer.insert(0, "0");
		}
		return stringBuffer.toString();
	}
}
