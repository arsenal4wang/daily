package DataStructure.org.ds.sort;

//.ð������
//����˼�룺��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵�����
//     �ýϴ�������³�����С������ð������ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
public class SortDemo04 {
	public static void main(String args[]) {
		int a[] = { 23, 43, 54, 13, 12, 45, 47, 68, 78, 98, 9, 75, 32 };
		int temp = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j + 1] < a[j]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
	}

}
