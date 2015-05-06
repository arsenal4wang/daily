package org.wang.io;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_demo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));

		try {
			String s2 = "2013-01-23";
			DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
			Date date2 = df2.parse(s2);
			System.out.println(date2);
			//DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//System.out.println(df3.format(date2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
