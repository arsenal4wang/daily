package org.wang.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileString {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("E:\\db\\a.txt"));
		List<String> list = new ArrayList<>();
		String line;
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		reader.close();
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
