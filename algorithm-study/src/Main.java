import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		String chs = "";
		Scanner in = new Scanner(System.in);
		String[] ss = in.nextLine().split(" ");
		n = Integer.parseInt(ss[0]);
		m = Integer.parseInt(ss[1]);
		chs = in.nextLine();
		in.close();
		
		work(n,m,chs);
		
	}

	private static void work(int n, int m, String chs) {
		
		String a[] = chs.split("b");
		String b[] = chs.split("a");
		
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i].length() > 0){
				aList.add(a[i].length());
			}
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i].length() > 0){
				bList.add(b[i].length());
			}
		}
		
		Integer countA[] = aList.toArray(new Integer[0]);
		Integer countB[] = bList.toArray(new Integer[0]);
		
		int maxA = 0;
		for (int i = 0; i < countA.length - m; i++) { // 能替换次数
			int tempSum = getSum(countA,countB,i,1 + m,true);
			if(tempSum > maxA){
				maxA = tempSum;
			}
		}
		
		int maxB = 0;
		for (int i = 0; i < countB.length - m; i++) { // 能替换次数
			int tempSum = getSum(countA,countB,i,m + 1,false);
			if(tempSum > maxB){
				maxB = tempSum;
			}
		}
		int max = maxA > maxB ? maxA : maxB;
		System.out.println(max);
	}

	private static int getSum(Integer[] countA, Integer[] countB, int iStart, int length,boolean isAStart) {
		int sum = 0;
		for (int i = 0; i < length; i++) {
			if(isAStart){
				sum += countA[iStart + i];
				if(countA[iStart + i] > 1){
					length = length - (countA[iStart + i] - 1 );
				}
				if(i >= length - 1){
					break;
				}
				sum += countB[iStart + i];
			} else {
				sum += countB[iStart + i];
				if(countB[iStart + i] > 1){
					length = length - (countB[iStart + i] - 1 );
				}
				if(i >= length - 1){
					break;
				}
				sum += countA[iStart + i];
			}
		}
		return sum;
	}
	
	
	
}
