package com.bage.fenzhi;

/**
 * Çó N ´ÎÃİ
 * @author bage
 *
 */
public class Ncimi {

	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public int nCimi(int a,int n){
		
		if(n <= 0){
			return 1;
		}else {
			return a * nCimi(a, n - 1);
		}
	}
	
}
