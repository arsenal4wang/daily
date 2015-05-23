package org.wang.result;

import java.util.*;

public class graph {
	// �����Ȩͼ��-1��ʾ��·��ͨ���Լ����Լ�Ҳ��-1��������ʾȨֵ��
	/*
	 * private static int[][] graph= { {-1,2,3,3}, {-1,-1,-1,2}, {-1,2,-1,3},
	 * {-1,-1,-1,-1} };
	 */
	private static int[][] graph = { { -1, 1, 1, 1, -1, -1 },
			{ -1, -1, -1, -1, 1, 1 }, { -1, -1, -1, -1, -1, 1 },
			{ -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1 } };

	private static String[] noteNames = { "s1", "s2", "s3", "s4", "s5", "s6",
			"s7", "s8", "s9", "s10" };

	private static boolean[] hasFlag = new boolean[graph.length];
	// true-��ʾ�ý���ѷ��ʹ���false-��ʾ��û�з��ʹ���

	private static ArrayList<String> res = new ArrayList<String>();

	// �������е�·���Ľ����ÿһ��·���ĸ�ʽ���磺0->2->1->3:7

	// ����ͼgraph��Դ��s��Ŀ���d֮�����еļ�·���������·���ĺ͡�
	public static void getPaths(int s, int d, String path, int sum) {
		hasFlag[s] = true;// Դ���ѷ��ʹ�.
		for (int i = 0; i < graph.length; i++) {
			if (graph[s][i] == -1 || hasFlag[i]) {
				continue;
			}
			// ����·��ͨ���ѷ��ʹ���������һ����㡣
			if (i == d)// �����ҵ�һ��·��
			{
				// res.add(path + "->" + d + ":" + (sum + graph[s][i]));// ��������
				res.add(path + " " + noteNames[d]);// �������� czf
				continue;
			}
			getPaths(i, d, path + " " + noteNames[i], sum + graph[s][i]);// ������
			hasFlag[i] = false;
		}// for(i)
	}

	public static void main(String[] args) {
		// getPaths(0, 3, ""+0, 0);//��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0

		for (int i = 0; i < graph.length; i++) {
			Boolean flag = true;
			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] != -1) {
					flag = false;
				}
			}
			if (flag) {
				getPaths(0, i, "s1", 0);// ��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0
			}
		}

		// getPaths(0, 3, "s1", 0);// ��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0
		// getPaths(0, 4, "s1", 0);// ��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0
		// getPaths(0, 5,"s1", 0);// ��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0

		System.out.println(res);
		for (String e : res)// ��ӡ���еĽ��
		{
			System.out.println(e);
		}
	}

}