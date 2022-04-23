package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* ������ 2
 * 
 * ���� ���� ������ DP�� �����غ���
 * �������� �������� �ݺ��� �Ǹ� ������� 2���� �迭�� ������.
 * 1. �������� �迭
 * 2. �������� �迭
 * 
 * ������
 * ���Խ�Ű�� ���, ���Խ�Ű�� �ʴ� ��� N �� ũ�Ⱑ ũ�� �ð� ���⵵ O(n^2)
 * 
 * []k[] k�� ���� ��Ű�� �ʴ°�� 
 * 
 * 
 * 
 * �迭�� ���̰� N�̶��  O(N)
 * N�� ���� ���� , ������ �� �ѹ��� �غ���. O(N)
 * 
 * �� O(N^2)
 * 
 * �ð� ���⵵ ���̱�
 * 
 * [ K-1������ ������  ]K[ K+1���� ������    ]
 * 
 * �ΰ� �迭 �����Ѵ�
 * �׸��� ���Ѵ� �׷��� K�� �������� �ʴ� ������  == ������ ������ �ð����⵵�� ������
 * 
 * 
 * �񱳹��
 * D[i] = d[i-1]���� ���� �� + arr[i];
 * 
 * �Ųٷ� 
 * int i = N-1  i ~0 i--
 * d[i] = arr[i]
 * 
 * 
 * D2[i] = d[i+1] + arr[i];
 * 
 *  10
 * 10 -4 3 1 5 6 -35 12 21 -1
 * 
 * */
public class number3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[N] ;
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// k-1���� �迭 ������
		int D[] = new int[N];
		
		for(int i = 0; i <N; i++) {
			D[i] = arr[i];
		}
		
		for(int i = 0; i <N; i++) {
			if(i - 1 >= 0) {
				if(D[i] < D[i-1] + arr[i]) {
					D[i]  = D[i-1] + arr[i];
				}
				
			}
		}
	
		
		
		
		// k+1���� ������ 
		int D2[] = new int[N];
		
		for(int i = 0; i < N ; i++) {
			D2[i] = arr[i];
		}
		
		for(int i = N-1; i >=0 ; i--) {
			if( i + 1 < N) {
				if(D2[i] < D2[i+1] + arr[i]) { // i��ġ�� ���� (i-1) + (i+1)�� ���Ѱ�
					D2[i] = D2[i+1] + arr[i];
				}
				
			}
		}
		
		// ���� ���� ���� ��� D2 �迭 �ʿ����
		int ans = D[0]; 
		for(int i = 0; i <N; i++) {
			ans = Math.max(ans, D[i]);
		}
		
		
		
		// ���� �� ���
		/* [10, -4, 3, 1, 5, 6,     (* -35),  12, 21, -1] : -35�� �����
		 * [10, 6, 9, 10, 15,   (21),  -14,   12, 33, 32] : D1[21] +
		 *[21, 11, 15, 12, 11, 6, -2,        (33), 21, -1]: D2[33] */ 
		// int ans = 0;
		for(int i = 0; i <N; i++) {
			if(i - 1 >=0 && i + 1 < N) {
				ans = Math.max(ans, D[i-1] + D2[i+1]);
				
			}
		}
		System.out.println(ans);
		
		
	}
}
