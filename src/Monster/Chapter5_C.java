package Monster;

import java.util.Scanner;

//2 1 4 5 1 3 3
public class Chapter5_C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int board[][] = new int[10][10];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int max = Integer.MIN_VALUE;
		// board ä���
		for(int i = 0; i<n; i++) {
			for(int j = n-1; j >= n - arr[i]; j--) {
				board[j][i] = 1;
			}
		}
		int maxArea = 0;
		// �ִ� ���� ã��
		for(int i = n-1; i>=0; i-=1) {
			int height = 0;
			int count = 0;
			for(int j = 0; j<n; j++) {
				if(board[i][j] == 1) {
					count++;
				}else {
					count = 0;
				}
			 height = Math.max(count, height);
			}
			// ���̺� �ִ� ũ��
			int size = height * (n - i);
			System.out.println(n-i+"���� �ִ���� :="+size);
			maxArea = Math.max(maxArea, size);
		}
		System.out.println(maxArea );
		
	
			
		
		
	}
}
