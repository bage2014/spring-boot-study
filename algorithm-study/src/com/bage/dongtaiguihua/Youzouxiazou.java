package com.bage.dongtaiguihua;

import java.util.Random;

/**
 * 只能向右走或者向下走，求最短路径和
 * @author bage
 *
 */
public class Youzouxiazou {
	
	private Random random = new Random();
	
	private int nextInt(int bound){
		return random.nextInt(bound);
	}
	
	private void print(int a[][],int b[][],int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "/" + b[i][j] + "\t");				
			}
			System.out.println();
		}
	}
	public int count(int n){
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = nextInt(10);				
			}
		}
		//print(a, n);
		int b[][] = new int[n][n];
		int res = count(a,n,n - 1,n - 1,b);
		print(a,b,n);
		return res;
	}

	public int count(int[][] a, int n,int i, int j,int b[][]) {
		
		if(i == 0 && j == 0){
			b[i][j] = a[0][0];
			return b[i][j];
		}
		if(i == 0){
			b[i][j] = a[i][j] + count(a,n,i,j - 1,b);
			return b[i][j];
		}
		if(j == 0){
			b[i][j] = a[i][j] + count(a,n,i - 1,j,b);
			return b[i][j];
		}
		int count1 = count(a,n,i - 1,j,b);
		int count2 = count(a,n,i,j - 1,b);
		if(count1 > count2 ){
			b[i][j] = count2 + a[i][j];
		}else{
			b[i][j] = count1 + a[i][j];
		}
		return b[i][j];
	}

}
