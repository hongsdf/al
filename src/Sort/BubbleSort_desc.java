package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_desc {
//	public static void bubble(int arr[]) {
//		// bubble ����
//		// ��ĭ �� ��ĭ�� ���ؼ� �ڸ��� �ٲ۴�
//		// �ݺ� Ƚ�� :  arr.length -1
//		// �� ���� ���� -1 Ƚ��
//		
//		for(int i =0; i<arr.length-1;i++) { // 4 ��
//			for(int j =0; j<arr.length-1 -i;j++) { //4 3 2 1 Ƚ��  �� 10�� 
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//					// �ð��� �ߤ�
//				}
//			}
//		}
//		for(int i =0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Integer arr[] = new Integer[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = Integer.parseInt( br.readLine());
			
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		// �� �྿ �Է��� �޴´�
		for(int i =0; i<n; i++) {
			sb.append(arr[i]+ "\n" );
		}
		System.out.println(sb);
		
	}

}
