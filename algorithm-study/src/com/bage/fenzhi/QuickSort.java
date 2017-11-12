package com.bage.fenzhi;

/**
 * ��������
 * @author bage
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int a[] = {3,2,6,8,1,9,1,5,4,7};
		new QuickSort().quickSort(a);
	}
	
	/**
	 * ��������
	 * @param a ����������
	 */
	public void quickSort(int a[]){
		quickSort(a, 0, a.length - 1);
		print(a);
	}

	/**
	 * 
	 * @param a ����������
	 * @param i ���鿪ʼ�±�(����)
	 * @param j ��������±�(����)
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
	 * ��һ��������һ����Ϊ��׼�����л��ֵ����ߣ�һ��Ҫ���ұ߿�ʼ���в��ң�
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	private int Divide(int[] a, int i, int j) {
		int p = a[i]; // ���ֵ�,����С�ķ�����ߣ������ұ�
		int indexLeft = i;
		int indexRight = j;
		int temp = 0;
		while(indexLeft < indexRight){
			// �����ұ�
			while(a[indexRight] >= p && indexLeft < indexRight){
				indexRight -- ;
			}
			// �������
			while(a[indexLeft] <= p && indexLeft < indexRight){ // ����Ҫ����λ��
				indexLeft ++;
			}
			// ˵����ʱ��Ҫ���н���
			if(indexLeft < indexRight){
				temp = a[indexLeft];
				a[indexLeft] = a[indexRight];
				a[indexRight] = temp;
				indexRight --;
			}
		}
		// ����ڽ��н���һ��
		temp = a[indexLeft];
		a[indexLeft] = a[i];
		a[i] = temp;
		return indexLeft;
	}
	
}

