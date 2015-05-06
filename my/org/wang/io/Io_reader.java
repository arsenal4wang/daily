package org.wang.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


/*
 * 读取磁盘上的文件内容
 */
public class Io_reader {
	
	public static void main(String[] args)throws IOException {
		String path="E://my.txt";
		bufferreader(path);
	}
	/*
	 * bufferreader方式读取
	 */
	public static void bufferreader(String path) throws IOException{
		BufferedReader reader =new BufferedReader(new FileReader(new File(path)));
		String string="";
		while ((string=reader.readLine())!=null) {
			System.out.println(string);
		}
	}
	
	/*
	 * inputstream方式读取
	 */
	public static void inputstream(String path) throws IOException{
			//inputstream方式的读取还需要借助bufferreader的方式进行读取
	}
}
