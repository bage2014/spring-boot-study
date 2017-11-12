package com.bage.fenzhi;

/**
 * 快速排序
 * @author bage
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int a[] = {3,2,6,8,1,9,1,5,4,7};
		new QuickSort().quickSort(a);
	}
	
	/**
	 * 快速排序
	 * @param a 待排序数组
	 */
	public void quickSort(int a[]){
		quickSort(a, 0, a.length - 1);
		print(a);
	}

	/**
	 * 
	 * @param a 待排序数组
	 * @param i 数组开始下标(包含)
	 * @param j 数组结束下标(包含)
	 */
	private void quickSort(int[] a, int i, int j) {
		if(i >= j){
			return ;
		}
		int nextIndex = Divide(a,i,j);
		quickSort(a, i, nextIndex - 1);
		quickSort(a, nextIndex+1, j);
	}

	private void print(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	/**
	 * 将一个数组以一个数为标准，进行划分到两边（一定要从右边开始进行查找）
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	private int Divide(int[] a, int i, int j) {
		int p = a[i]; // 划分点,比他小的放在左边，否则右边
		int indexLeft = i;
		int indexRight = j;
		int temp = 0;
		while(indexLeft < indexRight){
			// 先找右边
			while(a[indexRight] >= p && indexLeft < indexRight){
				indexRight -- ;
			}
			// 在找左边
			while(a[indexLeft] <= p && indexLeft < indexRight){ // 不需要交换位置
				indexLeft ++;
			}
			// 说明此时需要进行交换
			if(indexLeft < indexRight){
				temp = a[indexLeft];
				a[indexLeft] = a[indexRight];
				a[indexRight] = temp;
				indexRight --;
			}
		}
		// 最后在进行交换一次
		temp = a[indexLeft];
		a[indexLeft] = a[i];
		a[i] = temp;
		return indexLeft;
	}
	
}

