package com.bage.fenzhi;

/**
 * 归并排序
 * @author bage
 *
 */
public class MergeSort {

	/**
	 * 
	 * @param a
	 * @param start
	 * @param end
	 */
	public void mergeSort(int a[],int start,int end) {
		if(end <= start){ // 不用排序
			return ;
		}
		int middleIndex = start + (end - start + 1) / 2; // 取中点
  		mergeSort(a, start, middleIndex - 1);
  		mergeSort(a, middleIndex, end);
		// 已经有序,进行归并
		merge(a,start,middleIndex,end);
	}

	/**
	 * 
	 * @param a
	 * @param start
	 * @param middleIndex 此下标下属于第二个数组
	 * @param end
	 */
	private void merge(int[] a, int start, int middleIndex, int end) {
		int b[] = new int[end - start + 1];
		int i = 0;
		int indexStart = start;
		int indexEnd = middleIndex;
		while(i < b.length && indexStart < middleIndex && indexEnd <= end){
			// 如果前部分数组的第一个元素比后部分的第一个元素小
			if(a[indexStart] <= a[indexEnd] ){
				b[i] = a[indexStart ++];
			}else{
				b[i] = a[indexEnd ++];
			}
			i ++;
		}
		while(indexStart < middleIndex){
			b[i] = a[indexStart ++];
			i ++;
		}
		while(indexEnd <= end){
			b[i] = a[indexEnd ++];
			i ++;
		}
		for (int j = 0; j < b.length; j++) {
			a[start + j] = b[j];
		}
	}
	
}
