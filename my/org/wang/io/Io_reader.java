package org.wang.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


/*
 * ��ȡ�����ϵ��ļ�����
 */
public class Io_reader {
	
	public static void main(String[] args)throws IOException {
		String path="E://my.txt";
		inputstreamreader(path);
	}
	/*
	 * inputstream��ʽ��ȡ
	 */
	public static void inputstreamreader(String path) throws IOException{
		BufferedReader reader =new BufferedReader(new FileReader(new File(path)));
		String string="";
		while ((string=reader.readLine())!=null) {
			System.out.println(string);
		}
	}
}
