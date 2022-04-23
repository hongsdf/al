package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*0�� 1�θ� �̷���� ���� �������� �Ѵ�. �̷��� ������ �� Ư���� ������ ���� �͵��� �ִµ�, �̵��� ��ģ��(pinary number)�� �Ѵ�. ��ģ���� ������ ������ �����Ѵ�.

��ģ���� 0���� �������� �ʴ´�.
��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
 n = 90 �̿��� return ���� int�� ���������� ������ �̹Ƿ� 90�̸� 00011000.. �̷����ϰ��̴�. 
 �׷��� long */
public class chinsu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long d[][] = new long[N+1][2];
		
		/* ���ڸ� �� ó�� */
		
		d[1][1] = 1;
//		d[1][0] =1;
		for (int i = 2; i <= N; i++) {

			if (i - 1 >= 0) {
				d[i][1] = d[i - 1][0];

				d[i][0] = d[i - 1][0] + d[i - 1][1];

			}
			
			
		}
		long ans = 0;
		for(int i = 0; i<2; i++) {
			ans += d[N][i];
		}
		System.out.println(ans);

	}
}
