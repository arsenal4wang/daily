package org.wang.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.reflect.generics.tree.Tree;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class hello {
	public static void main(String[] args) throws IOException {
		String fileName = "D:" + File.separator + "hello.txt";
		File file = new File(fileName);
		OutputStream out = new FileOutputStream(file);
		String string = "你好";
		out.write(string.getBytes());
		out.close();

		InputStream in = new FileInputStream(file);
		byte[] b = new byte[1024];
		int len = in.read(b);
		in.close();
		System.out.println(new String(b, 0, len));

		String test = new String("我的中国人".getBytes("GBK"), "ISO-8859-1");
		String test1 = new String(test.getBytes(), "GBK");
		System.out.println(test);
		System.out.println(test1);
		System.out.println(add(1));
	}

	public static int add(int n) {
		if (n<0) {
			return 0;
		}
		if (n==1) {
			return 1;
		} else {
		return 2*n-1+add(n-1);
		}
	}
}
