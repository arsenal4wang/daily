package org.wang.main_classDemo;

public class StringBufferDemo {
	/*
	 *stringbuffer��ʹ�û������������ַ����ġ�string�������һ������֮���ܸı䣬�ı��ֻ�����ڴ�
	 *��stringbuffer֮�����ǿ����޸����ݡ� 
	 *sb��һ���� ������string��������ֱ�ӵĸ�ֵ������ͨ�����췽����ɣ� 
	 *�ַ�����+������sb����ֻ��ʹ��append�����������в���������ֵ��Ȼ��һ��sb���͡�
	 *append()���������ַ��������ӡ�
	 *
	 *������ҪƵ���޸��ַ������ݵľ�ʹ��StringBuffer��ʹ�á�����
	 */
	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer();
		buf.append("Hello World").append("��ҫ��");//������������
		buf.append("\n");
		buf.append("����=").append(1).append("\n");
		StringBuffer b2=new StringBuffer();	
		
		b2.append("Hello");
		//fun(b2);//�޸�sb������
		/*
		 *��ָ��λ����������� 
		 */
		b2.insert(0, "��ҫ�� ");
		b2.insert(b2.length(), "�������");
		System.out.println(b2);
		 
		//b2.reverse(); // �ַ����ķ�ת����
		//b2.replace(0, 1, "�й�");//����0 1λ�õ������滻Ϊ�й�
		//String  str=b2.substring(2);//��ȡ�ӵڶ�λ�ÿ�ʼ������
		//System.out.println(str);
		
		//int i=b2.indexOf("��2ҫ��");//�鵽���ݷ���0  ���Ҳ�������-1
		int j=b2.codePointAt(2);//���ص���һ��unicode ���
		System.out.println(j);
		System.out.println(b2);
	}
	public 	static void fun(StringBuffer s){
		s.append("��ҫ��").append("ϰ��ƽ");
	}

}
