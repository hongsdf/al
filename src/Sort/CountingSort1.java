package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
//		Integer.valueOf(br.readLine());
		int temp[] =  new int[10001];
		int arr[] = new int[n];
		
		
		
		for(int i =0; i <n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		for(int i =0; i <n; i++) {
//			System.out.println(arr[i]);;
//		}
		for(int i =0; i<arr.length; i++) {
			// 0�� �ε��� 1��, 1�� �ε����� 2��
			temp[arr[i] - 1]++;
			
		}
		// while �� ���� �ʿ� temp����ϱ�

		
		
		
		for(int i =0; i<temp.length; i++)  {
			if(temp[i] != 0) { 
				for(int j =0; j<temp[i]; j++) {
					sb.append(i+1).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
