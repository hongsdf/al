package backjun;

import java.util.Scanner;
public class Back2775 {
public static void main(String[] args) {
		// 1�� 3ȣ => 0�� 1ȣ 2ȣ 3ȣ 1+2+3
		// 2�� 3ȣ => 1�� 1ȣ(1) 2ȣ(3) 3ȣ(6) = 10 
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[15][15];
		for(int i = 0; i < 15;i++) {
			a[i][1] = 1;
			a[0][i] = i;
		}
		
		for(int i = 1; i<15; i++) { // 1�� 2ȣ ���� 14�� 14ȣ���� ä���ֱ�
			for(int j = 2; j <15; j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			 // a[1][2] = a[0][2] + a[1][1]
			 // a[2][3] = a[1][3] + a[2][2];
			 // a[4][5] = a[3][5] + a[4][4]; // (126 = 70 + 56)
			}
		}
		int c = sc.nextInt();
		
		for(int i = 0; i<c; i++) {
			int n = sc.nextInt(); // ����
			int m = sc.nextInt(); // ȣ
			System.out.println(a[n][m]);	
		}
			
			
		
		
	
	
		
		//  2�� 1ȣ 2�� 2ȣ 2�� 3ȣ
		//  1�� 1ȣ 1�� 2ȣ 1�� 3ȣ
		//  0�� 1ȣ 0�� 2ȣ 0�� 3ȣ
		
		
		
		
	}

}
