package com.bage.dongtaiguihua;

/**
 * �����������
 * @author bage
 *
 */
public class Zuichangdizengzixulie {

	/*
	 * 
	 */
	public int longestSubStr(int []a,int n){
		int b[] = new int[n];
		for (int j = 0; j < b.length; j++) {
			b[j] = 0; // b[j]����a[j]��β��������г��� 
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			for(int j = 0;j < i;j ++){
				if(a[i] > a[j]){ // ���ܵ���
					b[i] = b[j] + 1;
				}
				if(b[i] > max){ // b[i] ѡ����
					max = b[i];
				}
			}
			b[i] = max;
		}
		return b[n - 1];
	}

}
