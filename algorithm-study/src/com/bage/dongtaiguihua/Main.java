package com.bage.dongtaiguihua;

/**
 * 
 * for(j=1; j<=m; j=j+1) // 第一个阶段 <br>
 * 	xn[j] = 初始值; <br>
 * 	for(i=n-1; i>=1; i=i-1)// 其他n-1个阶段 <br>
 * 		for(j=1; j>=f(i); j=j+1)//f(i)与i有关的表达式 <br>
 * 			xi[j]=j=max(或min){g(xi-1[j1:j2]), ......, g(xi-1[jk:jk+1])};  <br>
 * t = g(x1[j1:j2]); // 由子问题的最优解求解整个问题的最优解的方案  <br>
 * print(x1[j1]);  <br>
 * for(i=2; i<=n-1; i=i+1)  <br>
 * {   <br>
 *    t = t-xi-1[ji]; <br>
 *    for(j=1; j>=f(i); j=j+1) <br>
 *       if(t=xi[ji]) <br>
 *            break; <br>
 * }
 * 
 * @author bage
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// 走楼梯
		int n = new Zoutaijie().count(5);
		System.out.println(n);
		
		// 只能向下走向右走
		int max = new Youzouxiazou().count(5);
		System.out.println(max);
		
		// 最长递增子序列
		int a[] = {2,1,5,3,6,4,8,9,7};
		max = new Zuichangdizengzixulie().longestSubStr(a, a.length);
		System.out.println(max);
		
		// 背包问题
		a = new int[]{2,4,5,1,3};
		int v[] = {2,1,5,2,1};
		int maxV = 8;
		max = new Beibao().getMax(a, a.length, v, maxV);
		System.out.println(max);
		
	}
	
	
}
