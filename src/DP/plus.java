package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long d[] = new long[1000001];
		d[0] = 1;
		
		// �ƿ� ó������ �� ����� ���� ��¸�
		for(int i = 1; i<= 1000000; i++) {
			if(i - 1 >= 0) {
				d[i] += d[i-1];
				
			}
			if(i - 2 >= 0) {
				d[i] += d[i-2];
			}
			if(i - 3 >= 0) {
				d[i] += d[i-3];
			}
			d[i] %= 1000000009L;
		}
		
		
		
		while(T -- > 0) {
			int Num = Integer.parseInt(br.readLine());
			System.out.println(d[Num]% 1000000009L);
			/*��ȭ��
			 1,2,3���Ѵ�
			 D[N] = N���� 1,2,3�� ���ؼ� �ϼ��� ����Ǽ�
			 D[n-1] = n-1���� 1,2,3 �� ���ؼ� �ϼ��� ����� ��
			 o + o + o + .. + = N
			 o + o + 1  = N
			 o + o + 2  = N
			 o + o + 3  = N
			  
			 
			 * */
			/* ����� �� ����  */ 
			// �ʱ� �� ����
//			d[0] = 1; // ������
			
			
		}
		
	}
}
