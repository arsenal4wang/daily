package org.wang.result;

import java.util.*;

public class graph {
	// 有向带权图。-1表示无路可通。自己到自己也是-1。其它表示权值。
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
	// true-表示该结点已访问过。false-表示还没有访问过。

	private static ArrayList<String> res = new ArrayList<String>();

	// 最后的所有的路径的结果。每一条路径的格式是如：0->2->1->3:7

	// 求在图graph上源点s到目标点d之间所有的简单路径，并求出路径的和。
	public static void getPaths(int s, int d, String path, int sum) {
		hasFlag[s] = true;// 源点已访问过.
		for (int i = 0; i < graph.length; i++) {
			if (graph[s][i] == -1 || hasFlag[i]) {
				continue;
			}
			// 若无路可通或已访问过，则找下一个结点。
			if (i == d)// 若已找到一条路径
			{
				// res.add(path + "->" + d + ":" + (sum + graph[s][i]));// 加入结果。
				res.add(path + " " + noteNames[d]);// 加入结果。 czf
				continue;
			}
			getPaths(i, d, path + " " + noteNames[i], sum + graph[s][i]);// 继续找
			hasFlag[i] = false;
		}// for(i)
	}

	public static void main(String[] args) {
		// getPaths(0, 3, ""+0, 0);//从源点：0 到目点：3,初始路径："0" 初始和：0

		for (int i = 0; i < graph.length; i++) {
			Boolean flag = true;
			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] != -1) {
					flag = false;
				}
			}
			if (flag) {
				getPaths(0, i, "s1", 0);// 从源点：0 到目点：3,初始路径："0" 初始和：0
			}
		}

		// getPaths(0, 3, "s1", 0);// 从源点：0 到目点：3,初始路径："0" 初始和：0
		// getPaths(0, 4, "s1", 0);// 从源点：0 到目点：3,初始路径："0" 初始和：0
		// getPaths(0, 5,"s1", 0);// 从源点：0 到目点：3,初始路径："0" 初始和：0

		System.out.println(res);
		for (String e : res)// 打印所有的结果
		{
			System.out.println(e);
		}
	}

}