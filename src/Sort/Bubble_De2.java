package Sort;

import java.util.Scanner;

public class Bubble_De2 {
	public static void swap(int arr[],int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	
	
	public static void bubble(int arr[]) {
		// bubble ����
		// ��ĭ �� ��ĭ�� ���ؼ� �ڸ��� �ٲ۴�
		// �ݺ� Ƚ�� :  arr.length -1
		// �� ���� ���� -1 Ƚ��
		
		// (����)�ð��� ���̱� ���� ����
		boolean flag = false;
		
		for(int i =0; i<arr.length-1;i++) { // 4 ��
			for(int j =0; j<arr.length-1 -i;j++) { //4 3 2 1 Ƚ��  �� 10�� 
				// �� ������ ���� �� ���� swap�Լ��� ����Ǵ� ��
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					flag = true;
				}
			}
			// �� ������ ����Ǵ� ����  : ���忡�� ��ȯ�� �̷������ �ʴ� ��
			if(flag = false) {
				break;
			}
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bubble(arr);
	}
	

}
