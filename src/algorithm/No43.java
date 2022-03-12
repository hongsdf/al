package algorithm;

import java.util.Scanner;

public class No43 {
	// DP : Dynamic Programming (��ȭ��)
	// ���� ������� ū ������ �ذ��ϴ� ���
	
	static int[] ans = new int [1000];
	static int[] arr = new int [1000];
	public static void main(String[] args) {
		
		/*
		 * n���� ������ ������ �ִ�. ������ ������ ��Ÿ���� ��ġ�� �ٸ���. �� ������ ������ ����ؼ�, �� ��ġ�� ���� k���� �ǵ��� �ϰ� �ʹ�.
		 * �� ����� ���� ���Ͻÿ�. ������ ������ �� ���� ����� �� �ִ�.
		 * 
		 * ����� ������ ������ ������, ������ �ٸ� ���� ���� ����̴�.
		 * 
		 * int n = 3���� ����
		 * int k = ��
		 * n,k
		 * 1�� �����ǰ�ġ 
		 * 2�� �����ǰ�ġ 
		 * 3�� �����ǰ�ġ
		 * 
		 * 1,2,3���� �ջ��Ͽ� k�� ����� �ִ� ����� ��
		 */
		
	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i =0; i< n; i++) {
			arr[i] = sc.nextInt(); // 1������, 2�� ����, 3�� ����
				
		}
		// �ʱ�ȭ
		ans[0] = 1;

		for(int i = 0; i<n; i++) { // 1,2,3
			for(int v = arr[i]; v<=k ; v++) { // arr[0] : 1 ~ 10 arr[1] : 2 ~ 10
				ans[v] += ans[v- arr[i]]; //  1 - 1  // ans[1 - 1] = ans[0] = 1
				// �ؿ� ������ �ذ��ϸ� �� ū ������ �ذ�
				// ans[2] += ( 2 - arr[0] : 1) 
				// ans[2] = 2
				
				// ans[3] += ( 3 - 1��¥��) : 2
				// ans[3] = 2
			}
		}
		System.out.println(ans[k]);

	
				/*
				 *  ans :   1 2 3 4 5 6 7 8 9 10
				 *  1   	1 1 1 1 1 1 1 1 1 1
				 *  2   	0 1 1 2 2 3 3 4 4 5
				 *  5   	0 0 0 0 1 1 2 2 3 4 
				 *      	1 2 2 3 4 5 6 7 8 10
				 *  
				 * */
		
	}
}
