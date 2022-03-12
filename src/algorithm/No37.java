package algorithm;

import java.util.Scanner;

public class No37 {
	
	static int[] arr = new int[10000];
	
	// arr[2] = 1
	// arr[3] = 1
	// arr[4] = /2 + /2 = 2
	//		  = -1 + /3 = 2
	// arr[5] = -1 + /2 + /2 = 3
	//      =  -1  + /3 + -1 = 3
	// arr[6] = /3 + /3 = 2
	
	
	
	
	
	
	public static void main(String[] args) {
		arr[2] = 1; //arr[2] �� 1�� �ٲٴ� �ּ��� ���Ǽ��� 1
		arr[3] = 1; //arr[3] �� 1�� �ٲٴ� �ּ��� ���Ǽ��� 1
		/*�ֿ� ��������*/
		// DP���� ����ȭ: ����ȭ��? �������� ����Ǽ��� ���ÿ� �Ҽ� �ִ�
		// ���� ��� 6�� 2�� �������� �ְ� 3���ε� �������ִ�
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 10
		for(int i = 4; i < 10000; i++) {
			int a =999; int b =999; int c =999; // a,b,c�� ū�� �������� : w == (1,2,3)�۾��� ��ȯ�� �Ǹ�
			// a,b,c �� �Ѱ��̻��� ������ �ȴ�
			// �׷��� 
			// arr[i] = ?
			for(int w = 1; w <= 3; w++) { // ��� 3����
			if(w == 1) { // 1���� �۾�
				 a = arr[i-1]; // arr[3] = 1 -> a = 1 arr[4] = 2 -> a = 2
			}else if( w == 2) { // arr[2] = 1 -> b = 1 b= 999;
				if(i%2 == 0) {
					b = arr[i/2];
				}
			}else if(w==3) { // c =999;
				if(i%3 == 0) {
					c = arr[i/3];
				}
			}

		}
			int answer = min(a,b,c);
			arr[i] = 1 + answer; // ������� �۾��� arr[1], arr[2] , arr[3] ...arr[543] ����Ǽ� �� ��´�
		}
		System.out.println(arr[n]); // ����ϰ� ���� arr[n]�� ����Ѵ�
		
		// 1 3�� ����̸� 3���� ������
		// 2 2�� ����̸� 2�� ������
		// 3 1�� ����
		
		// 2 : 10/2  = 5
        // 3  5-1 = 4
		// 2  4/2 =2
		
		// 3 9 1 3 1 1
		
	}

	private static int min(int a, int b, int c) {
		int answer = 0;
		if(a > b) {
			if( b > c) 
				 answer = c;
			else 
				 answer = b;
			
		}else { // b > a 
			if(a > c) answer = c;
			else answer = a;
		}
		return answer;
	}
}
		
	

