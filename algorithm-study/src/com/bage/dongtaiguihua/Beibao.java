package com.bage.dongtaiguihua;

/**
 * ��������
 * @author bage
 *
 */
public class Beibao {

	/**
	 * 
	 * @param a ��Ʒ��ֵ����
	 * @param n ��Ʒ����
	 * @param v ��Ʒ����������
	 * @param maxV ���������װ����
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
		int value1 = getMax(a, i - 1, n, v, remainVal); // ��Ҫ��ǰ����Ʒ
		int value2 = a[i] + getMax(a, i - 1, n, v, remainVal - v[i]);
		return value1 > value2 ? value1 : value2;
		
	}
	
}
