package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class permutation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); // N�� ��
		int M = Integer.parseInt(st.nextToken()); // M���� �����
		int arr[] = new int[N+1];
		for(int i = 0; i<N; i++) {
			arr[i] = i+1;
		}
		boolean visit[] = new boolean[N];
		int[] output = new int[M]; // r := ���� ���� �� �ִ� ����
		// ������ �ִ� ����
		permute(arr,0,visit,N,M,output);
	}

	private static void permute(int arr[],int pos,boolean visit[],int n, int m,int[] output) {
		if(pos == m) {
			print(output,m); // ������� ���
			return;
		}
		// ��Ʈ��ŷ ���
		for(int i = 0; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				output[pos] = arr[i]; // �������
				permute(arr,pos+1,visit,n,m,output);
				visit[i] = false;
			}
		}
		
	}

	private static void print(int[] output, int m) {
		for(int i = 0; i<m; i++ ) {
			System.out.print(output[i]+" ");
		}
		System.out.println();
		
	}
}
