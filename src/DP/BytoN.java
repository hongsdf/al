package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*  ������� ������ ���� K�� �������� ������ ���� �ذ�  + �������� �����ϴ� ����
 * 
 * 	���� ���� + ���� ���� = ������� ����
 * 
 * 	10
		1 5 2 1 4 3 4 5 2 1
 * 
 * 
 * */ 
public class BytoN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[N] ;
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// Lis ���� ����
		int d[] = new int[N];
		
		for(int i = 0; i <N; i++) {
			d[i] = 1;
			
			for(int j = 0 ; j<= i; j++) {
				if(arr[i] > arr[j] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		// ���� ����
		
		int d2[] = new int[N];
		
		for(int i = 0 ; i<N; i++) {
			d2[i] = 1;
		}
		
		for(int i = N-1; i>=0; i--) {
			for(int j = i; j<N; j++) {
				if(arr[i] > arr[j] && d2[i] < d2[j]+1 ) {
					d2[i] = d2[j] + 1 ;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i<N; i++) {
			ans = Math.max(ans, d[i] + d2[i] - 1); // ����� ��ġ�� ������ -1
		}
		
		System.out.println(ans);
		
		
		
	}
}
