package com.bage.dongtaiguihua;

/**
 * ÿ��ֻ����1��������̨�ף�һ���ж������߷� <br>
 * f(n) == f(n - 1)��һ�� ���� f(n - 2) ������f(n-1)������;<br>
 * ��  f(n) == f(n - 1) + f(n - 1); <br>
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
