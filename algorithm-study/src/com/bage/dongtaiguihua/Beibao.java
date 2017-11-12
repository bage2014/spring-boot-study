package com.bage.dongtaiguihua;

/**
 * 背包问题
 * @author bage
 *
 */
public class Beibao {

	/**
	 * 
	 * @param a 物品价值数组
	 * @param n 物品个数
	 * @param v 物品的容量数组
	 * @param maxV 背包的最大装容量
	 * @return
	 */
	public int getMax(int a[],int n,int v[],int maxV){
		
		return getMax(a, n - 1,n, v, maxV);
		
	}

	private int getMax(int[] a, int i, int n, int[] v, int remainVal) {

		if(i < 0){
			return 0;
		}
		if(remainVal < v[i]){
			return 0;
		}
		int value1 = getMax(a, i - 1, n, v, remainVal); // 不要当前的物品
		int value2 = a[i] + getMax(a, i - 1, n, v, remainVal - v[i]);
		return value1 > value2 ? value1 : value2;
		
	}
	
}
