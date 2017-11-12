package com.bage.fenzhi;

/**
 * �鲢����
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
		if(end <= start){ // ��������
			return ;
		}
		int middleIndex = start + (end - start + 1) / 2; // ȡ�е�
  		mergeSort(a, start, middleIndex - 1);
  		mergeSort(a, middleIndex, end);
		// �Ѿ�����,���й鲢
		merge(a,start,middleIndex,end);
	}

	/**
	 * 
	 * @param a
	 * @param start
	 * @param middleIndex ���±������ڵڶ�������
	 * @param end
	 */
	private void merge(int[] a, int start, int middleIndex, int end) {
		int b[] = new int[end - start + 1];
		int i = 0;
		int indexStart = start;
		int indexEnd = middleIndex;
		while(i < b.length && indexStart < middleIndex && indexEnd <= end){
			// ���ǰ��������ĵ�һ��Ԫ�رȺ󲿷ֵĵ�һ��Ԫ��С
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
