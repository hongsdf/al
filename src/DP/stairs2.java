package DP;

import java.util.Scanner;

public class stairs2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int arr[] = new int[n+1];
		
		// �ʱⰪ
		int d[][] = new int[n+1][10];
		
		
		for(int i = 1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		// ��ȭ��
		for(int i = 2; i <= n; i++) {
			 for(int j = 0; j<= 9; j++ ) {
				 //10 �̻�
				 if(j + 1 < 10) {
					 d[i][j] += d[i-1][j+1];
					 
				 }
				 
				 // 0 ����
				 if( j - 1 >= 0) {
					 d[i][j] += d[i-1][j-1];
					 
				 }
				 
			 }
		}
		int ans = 0;
		for(int i = 0; i<=9; i++) {
			ans += d[n][i];
		}
		
		System.out.println(ans);
		
		
	}
}
