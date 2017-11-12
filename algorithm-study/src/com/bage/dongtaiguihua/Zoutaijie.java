package com.bage.dongtaiguihua;

/**
 * 每次只能走1或者两层台阶，一共有多少种走法 <br>
 * f(n) == f(n - 1)走一层 或者 f(n - 2) 不经过f(n-1)跨两层;<br>
 * 即  f(n) == f(n - 1) + f(n - 1); <br>
 * @author liyinyong
 *
 */
public class Zoutaijie {

	public int count(int n){
		int a[] = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
		return count(n,a);
	}
	
	private int count(int n,int a[]){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		if(a[n - 1] == 0){
			a[n - 1] = count(n - 1,a);
		}
		if(a[n - 2] == 0){
			a[n - 2] = count(n - 2,a);
		}
		return a[n - 1]+a[n - 2];
	}
	
}
