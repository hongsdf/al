package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ߺ� ���� ���� 
public class N_M4 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // N�� ��
		int M = Integer.parseInt(st.nextToken()); // M���� �����
		int arr[] = new int[M]; // r���� ���ð���

		dfs(arr,1,0,N,M); // ������ġ, ���� := ���� ���� 
		
	}
	private static void dfs(int arr[],int pos, int depth, int n, int r) {
		if(depth == r) {
		   print(arr,r);
		   return;
		}
		for(int i = pos; i <=n; i++) {
			arr[depth] = i;
			dfs(arr,i,depth+1,n,r);
		}
		
	}
	private static void print(int[] arr, int r) {
		for(int i = 0; i <r; i++) {
			System.out.print(arr[i]+" ");
//			sb.append(arr[i]).append(" ");
		}
//		sb.append('\n');
		System.out.println();
		
	}
	
	

	
}
