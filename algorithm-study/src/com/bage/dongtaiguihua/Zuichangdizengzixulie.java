package com.bage.dongtaiguihua;

/**
 * 最长递增子序列
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
			b[j] = 0; // b[j]：以a[j]结尾的最长子序列长度 
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			for(int j = 0;j < i;j ++){
				if(a[i] > a[j]){ // 不能等于
					b[i] = b[j] + 1;
				}
				if(b[i] > max){ // b[i] 选最大的
					max = b[i];
				}
			}
			b[i] = max;
		}
		return b[n - 1];
	}

}
