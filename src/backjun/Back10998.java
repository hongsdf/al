package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10998 {
	public static int[] arr = new int[10000001];
	
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i =0; i <N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		for(int i =0; i <N; i++) {
//			System.out.println(arr[i]);
//		}
		quick(arr,0,N-1);
		for(int i=0; i <N; i++) {
			System.out.println(arr[i]);
		}
	}




	private static void quick(int[] arr2,int start, int end) {
		if(start >= end) {
			return ;
		}
		
		
		int key = start;
		int i = start +1;
		int j = end;
		int tmp;
		
		
	while(i <=j) { // �� ������ �ش� �Ǵ� ���� ���� �ؾ� �Ѵ�(����, ������)
		while (arr[i] <= arr[key]) { // ū �� ���� ����
			i++;
		}
		while(arr[j] >= arr[key] && j > start) { // ���� �ſ��� ����
			j--;
		}
		
		if(i > j) {
			tmp = arr[key];
			arr[key] = arr[j];
			arr[j] = tmp;
		}else {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
		quick(arr,start,j-1);
		quick(arr,j+1,end);
	}
}
