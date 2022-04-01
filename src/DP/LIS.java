package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
// ���غ��� ���� ���� ã�� &&
// �������� ��ġ�迭�� ���̰� ������ ���̺��� Ŭ ��쿡�� ����

// *���� ������ ���� ���� ��ġ�迭�� ũ�Ⱑ ������ ������ �ʿ䰡 ����
public class LIS {
	public static int N; 
	public static Integer arr[];
	public static Integer D[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			
		}
		 LIS(arr);
		 Arrays.sort(D,Collections.reverseOrder());
		 System.out.println(D[0]);
		 
	}

	private static void LIS(Integer[] arr) {
//		int cnt = 0;  
		D = new Integer[arr.length];
		for(int i=0;i<arr.length; i++) {
			D[i] = 1; // �ڱ� �ڽ��� ��ġ������ 1�� �ʱ�ȭ
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) { // ���غ��� ���� ���� �ִٸ� ��ġ���� ����
					D[i] = Math.max(D[i], D[j]+1); // ���غ��� ���� ���� �ְ�, �� ��ġ���� ������ ũ�� �����ϴ� ����
					
				}
			}
		}
		
		
	}
}
