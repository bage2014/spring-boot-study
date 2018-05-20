package com.bage.digui;

/**
 * 
 * @author bage
 *
 */
public class ChaifenShu {

	static int count = 0;
	public static void main(String[] args) {
		int[] a = {1,2,5,10};
		int[] b = {3,4,7};
		int m = 10;
		int[] res = new int[10000];
		work(a,b,m,m,0,res);
	}
	private static void work(int[] a, int[] b, int m, int remain,int deep,int[] res) {
		if(remain == 0){
			count ++;
			for (int i = 0; i < deep; i++) {
				System.out.print(res[i] + "\t");
			}
			System.out.println();
			return ;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
			}
		}
	}
	
	
}
