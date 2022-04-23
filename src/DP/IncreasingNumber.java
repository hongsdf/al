package DP;

import java.util.Scanner;

/*������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �̶�, ������ ���� ���Ƶ� ������������ ģ��.

���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.

���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.*/
public class IncreasingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[][] = new int[N+1][10];
		//�ʱⰪ
		for(int i = 0; i <= 9; i++) {
			d[1][i] = 1;
		}
		
		for(int i = 2; i<=N; i++) {
			for(int j = 0; j <=9; j++) {
				for(int k = 0; k<=9; k++) { // 3������ ��� j���� �۰ų� ���ٴ� ���� ǥ���ϱ� ���� ������ ��� 
					if(k <= j) {
						d[i][j] += d[i-1][k];
						
					}
					d[i][j] %= 10007;
				}
			}
		}
		int ans = 0;
		for(int i = 0; i<=9; i++) {
			ans += d[N][i];
		}
		System.out.println(ans);
	
	
	}
}
