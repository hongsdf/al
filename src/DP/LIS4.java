package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*  10, 30, 10, 20, 20, 10  */ 
public class LIS4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[N] ;
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ��� �迭
		int d[] = new int[N];
		for(int i = 0; i <N; i++) {
			d[i] = 1;
		}
		
		// �����ϴ� �迭�� �Ųٷ� �����ߴ�.
		// 10 , 30 ... 
		//  1  , 2 �ϰ� (30 ���Ҵ� ����������) �׷��� �ڷ� ����
//		for(int i = 0; i<N; i++) {
//			for(int j = 0; j < i; j++) {
//				// 10 30 10 20 20 10����
//				// ����� [1, 1, 2, 2, 2, 3] ���´� �ؼ� : i���� ��ġ������ ����
//				if(arr[j] > arr[i] && d[i] < d[j]+ 1 ) {
//					d[i] = d[j] + 1;
//				}
////				1 3 1 2 2 1
//			}
//		}
		
		for(int i = N-1; i>=0; i--) {
			for(int j = i; j < N; j++) {
				if(arr[j] < arr[i] && d[i] < d[j]+1  ) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		
		int ans = 0;
		for(int i = 0; i <N; i++) {
			ans = Math.max(ans, d[i]) ;
		}
		System.out.println(ans);
		
		
	}
}
