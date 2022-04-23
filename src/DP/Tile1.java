package DP;
/* 2��n ũ���� ���簢���� 1��2, 2��1 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Ʒ� �׸��� 2��5 ũ���� ���簢���� ä�� �� ���� ����� ���̴�.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 * N ���� N�� �־� ������ ����Ǽ�*/
// ��ȭ�� D[N] = ����Ǽ��� ?
// �������� 1*2 , 2*1 Ÿ�� �̶�� �־��� �׷���
// Ÿ�ϼ���   =   1 * 2 (����Ǽ� ) +  2* 1(����� ��)

/* ū�� + ������ �� ���� �ؼ� ��������*/


public class Tile1 {
	public static int d[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		d = new int[1001];
		int ans = solve2(N);
		System.out.println(ans);
	
	}
	private static int solve(int n) {
//		if(n == 0) return 1; // ���ǻ��� 0�� �ϳ��� ����̴�(ä��� ������)
//		if(n == 1) return 1;
		d[0] = 1;
		d[1] = 1;
		
		// i == 2�������� n��° �������� ���ذ��� ���Ѵ�(Bottom-up)
		for(int i = 2; i <=n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		
		
		
		return d[n];
	}
	// top-Down
	private static int solve2(int n) {
		if(n == 0) return 1; // ���ǻ��� 0�� �ϳ��� ����̴�(ä��� ������)
		if(n == 1) return 1;
		// i == 2�������� n��° �������� ���ذ��� ���Ѵ�(Bottom-up)
		if(d[n] > 0 ) return d[n];
		d[n] = solve2(n-1) + solve(n-2);
		d[n] %= 10007;
		
		
		return d[n];
	}
	
}
