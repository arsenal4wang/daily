package DataStructure.org.ds.sort;

//.冒泡排序
//基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
//     让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
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
