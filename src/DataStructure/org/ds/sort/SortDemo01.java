package DataStructure.org.ds.sort;

public class SortDemo01 {

	/**
	 * ֱ�Ӳ������� ����˼�룺��Ҫ�����һ�����У�����ǰ��(n-1)[n>=2] �����Ѿ�����
	 * ��˳��ģ�����Ҫ�ѵ�n�����嵽ǰ����������У�ʹ����n���� Ҳ���ź�˳��ġ���˷���ѭ����ֱ��ȫ���ź�˳��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 23, 43, 54, 13, 12, 45, 47, 68, 78, 98, 9, 75, 32 };
		int temp = 0;
		for (int i = 1; i < a.length; ++i) {
			int j = i-1;
			temp = a[i];
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j]; // ������temp��ֵ�������һ����λ
			}
			a[j + 1] = temp;
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+"��");
	}

}
