package com.bage.fenzhi;

/**
 * 
 * Divide-and-Conquer(P) <br>
 * 1. if |P|≤n0 <br>
 * 2. then return(ADHOC(P)) <br>
 * 3. 将P分解为较小的子问题 P1 ,P2 ,…,Pk <br>
 * 4. for i←1 to k <br>
 * 5. do yi ← Divide-and-Conquer(Pi) △ 递归解决Pi <br>
 * 6. T ← MERGE(y1,y2,…,yk) △ 合并子问题 <br>
 * 7. return(T)<br>
 * 
 * @author bage
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// a 的 n 次幂
		int n = new Ncimi().nCimi(2, 3);
		System.out.println(n);
		
		// 归并排序
		int a[] = {2,5,1,7,4,9,6,3,8};
		new MergeSort().mergeSort(a, 0, a.length - 1);
		print(a);
		
		
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
	
}
