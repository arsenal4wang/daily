package org.wang.ceshi;
import java.net.* ;
import java.io.* ;
public class HelloClient{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		Socket client = null ;	// ��ʾ�� ����
		client = new Socket("localhost",8888) ;
		BufferedReader buf = null ;	// һ���Խ������
		buf = new BufferedReader(new InputStreamReader(client.getInputStream())) ;
		System.out.println("����������" ) ;
		String str = buf.readLine() ;
		System.out.println("��������������ݣ�" + str) ;
		buf.close() ;
		client.close() ;
	}
};