package DP;
/* ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�.
   ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N�� �ϼ��Ҷ� 1 + 2 + 3 �� ����Ǽ��� �� �� �Ѵ�
// D[N] = D[N-1] + D[N-2]+ D[N-3] 

/*
 *  N == 4��� �ϸ�
 *   O + O + O + O +... + = N�� �ϼ��� ���̴�.
 *     O + O + O + O +... +   1 == N
 *     N-1 = O + O + O + O +... + �̴�
 *     �׷���  O + O + O + O  == 3�� �ɰ��̴�.
 *     �� N-1�� �ϼ��ϱ� ���� 3�� ����ߴ�.
 *     �� 3�� �� 1,2,3���� �����Ͽ� �������� ���̴�.
 * 
 *  �� D[N-1] �� N-1���� ���� ������ ���� ��
 *  �ᱹ ������� ������� �ؿ��� �׾� �ø����̴�
 *  
 *  N-2  = O + O + O + O +... + �̴�
 *  �׷��� O + O + O + O == 2�̴�.
 *  �� N-2�� �ϼ��ϱ� ���� 2�� �̿��ߴ�.
 *  2�� 1,2�� �ϼ����� ���̴�.
 * 	
 * 
 * 
 * */


public class Number123 {
	public static int d[];
	public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			d = new int[12];
			while(T --> 0) {
				int num = Integer.parseInt(br.readLine());
				int ans = solve(num);
				System.out.println(ans);
			}
	}
	// ���� ó���� �ȵǾ� �ִ�.
	private static int solve(int n) {
		// ����ó���� �ϱ� ���� �ʱⰪ�� �����߿��ϴ�
		if(n == 0) return 1;
		if(n == 1) return 1;
		if(n == 2) return 2;
	
		
		if(d[n] > 0) return d[n];
		
		d[n] = solve(n-1) + solve(n-2) + solve(n-3);
		
		return d[n];
	}
	
	private static int solve2(int n) {
		d[0] = 1;
		for(int i = 1; i< 11; i++ ) {
			for(int j = 1 ; j <=3; j++ ) {
				// ������ �Ǵ� ��찡 ����
				if( i - j >= 0) { //����ó��
					d[i] += d[i-j];
				}
			}
		}
		
		return d[n];
	}
	
	
}
