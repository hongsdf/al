package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
// �̷� ������ ������ �����佺ü�� ���� ����
// 1 �� M �� N �� 1,000,000
public class Aretosche {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[M+1];
		boolean check[] = new boolean[M+1];
		// 3 ~ 16 
		int cnt = 0 ;
		// 0,1�� ����ó��
		check[0] = true;
		check[1] = true;
		
		for(int i = 2; i+i <= M; i++) {
			if(!check[i]) {
				// �������� �ʴ� ���� 2���� => 2�� ��� 4���� ��������.
				
				for(int j = i+i; j <= M; j+= i) {
					check[j] = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = N; i <=M; i++) {
			if(!check[i]) sb.append(i).append('\n');
		}
		
		System.out.println(sb.toString());
		
	}
}
