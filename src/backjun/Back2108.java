package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		������ : N���� ������ ���� N���� ���� ��
//		�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
//		�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//		���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
//		
//		5
//		1
//		3
//		8
//		-2
//		2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Case = Integer.parseInt(br.readLine());
		int arr[] = new int[Case];
		for(int i =0; i <arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		for(int a: arr) {
//			System.out.println(a);
//		}
		// 1�� ������ : N���� ������ ���� N���� ���� ��
		double sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		// Math�Լ��� round()  :  ù° �ڸ����� �ݿø� -> return int
		double round = sum / arr.length;
//		System.out.println(round);
		System.out.println(Math.round(round));
//		System.out.println(" �ݿø�"+Math.round(-1.8));
		
		// 2�� �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		Arrays.sort(arr);
		System.out.println(arr[arr.length/2]);
		
		// 3 �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//		int temp[] = new int[500001];
//		for(int i=0; i<temp.length;i++) {
//			temp[i] = 0;
//		}
//		int max = -1;
//		for(int i =0; i <arr.length; i++) {
//			temp[arr[i]]++;
//		}
//		int result = 0;
//		for(int i =0; i<temp.length; i++) {
//			if(max <= temp[i]) {
//				max = i;
//			}
//		}
//		System.out.println(max);
		
		// 4 : ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		
		System.out.println(arr[arr.length-1] - arr[0]);
	}
}
