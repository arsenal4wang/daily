package DataStructure.org.ds.sort;
// ��ѡ������
//��1������˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
//Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
public class SortDemo03 {
	public static void main(String args[]) {
		int a[] = { 23, 43, 54, 13, 12, 45, 47, 68, 78, 98, 9, 75, 32 };
		int position = 0;
		for (int i = 0; i < a.length; i++) {

			int j = i + 1;
			position = i;
			int temp = a[i];
			for (; j < a.length; j++) {
				if (a[j] < temp) {
					temp = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
