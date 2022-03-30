package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dynamic1_LIS {
	public static int N;
	public static int arr[];
	public static int d[]; // �� ��ġ�� �ִ���� ��
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		LIS(arr);
	}

	private static void LIS(int[] arr) {
		// 2���� �̴� : ��? 1.�迭���� 2.���� ���Һ��� �ľ��ϱ� ������ => 2����
		d = new int[arr.length];
		int max = 1;
		for(int i =0; i<arr.length; i++) {
			d[i] = 1; // d�迭 �ʱ�ȭ ����: �� ��ġ���� �ڽ��� �����ϸ� �ּұ��̰� 1�̱� �����̴�
			for(int j = 0; j < i; j++) {
				// ��ȭ��
				// ���� ������(i) �񱳴��(j)
				// j    		i(����) == > j���� i���� �ľ�
				// 0    		1
				// 0 1     		2
				// 0 1 2    	3
				// 0 1 2 3  	4
				//  �� ���� ���Ͽ� i(����)���� �۰� &&  ���� ���ڰ� ������ �ִ� �������̰� �� ũ�� �����´�
				if(arr[j] < arr[i] && d[j] >= d[i]) {
					d[i] = d[j]+1;
					if(max < d[i]) max = d[i];
				}
			}
		}
		
		
	}
}
		
