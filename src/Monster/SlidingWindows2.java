package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class SlidingWindows2 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	* ������ ��Ģ�� ���� ������ �¸��� �� �ִ� ����� ���� �����ϴ��� �˻��ϴ� �Լ�  
	*
	* @param data 
	* @param n 
	* @param k 
	* @return true   ������ �¸��� �� �ִ� ����� ���� �ϳ� �̻� �����Ѵٸ�
	* @return false  else
	*/
	public static boolean isWinnable(int[] data, int n, int k) {

		int winCount = 0;
	
		// ����ó��
		long sum = 0;
		for(int i = 0; i<k;i++) {
			sum += data[i];
		}
		if(sum %2 == 0) {
			return true;
		}
		
		for(int i = 0; i+k-1<n; i++) {
			 sum = 0;
			// sum := ������ ������ 
			// sum := data[i-1] +data[i+1]
			
			// ���� �������� ������ ���� �߰�
			// [2,3,4,5]
			// l1 = 2+3+4 --> S = 9
			// l2 = 9 - 2 + 5 = 12
			sum = sum - data[i-1] + data[i+k-1]; // ���� sum���� sum- data[i-1] + data[i+k-1]
			if(sum %2 == 0) {
				return true;
			}
		}
		
		

		if(winCount > 0)
		{
			return true; // ������ �̱�
		}else{
			return false; // �����̰� �̱�
		}
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		boolean result = isWinnable(data, n, k);

		if(result)
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
