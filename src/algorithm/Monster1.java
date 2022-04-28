package algorithm;

import java.io.*;
import java.lang.*;
import java.util.*;


// 10�� * 10�� => long
// �ε��� 1��°����
public class Monster1 {
	public static final Scanner scanner = new Scanner(System.in);
	/**
     * ������ m���� ���� ū Ű�� ���丮�� ã�� �Լ�
     * @param height  �� ���丮�� Ű
     * @param month   �� ���丮�� ��� ��
     * @param n   ���丮�� ��
     * @param m   ã���� �ϴ� ��
     * @return    month[k] == m�� ���� ū height[k]
     */
	public static int getMaximumHeight(int[] height, int[] month, int n, int m)
	{
		int answer = -1;
		int cnt = 0;
		for(int i = n-1; i >= 0; i--){
			cnt++;
			 if(month[i] == m ){
				 answer = height[i];
				 break;
			 }
			 
		}
		System.out.println(cnt);
		//�ð� ����
//		int answer = -1;
//		int cnt = 0;
//		for(int i = 0; i < n; i++){
//			cnt++;
//			 if(month[i] == m ){
//				 answer = height[i];
//			 }
//		}
//		System.out.println(cnt);
		
		
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt(); // ���丮 ��
		int[] height = new int[n]; //  Ű�迭
		int[] month = new int[n]; // �� �迭

		for(int i = 0 ; i < n ; i ++)
		{
			height[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			month[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();

		int answer = getMaximumHeight(height, month, n, m);

		System.out.println(answer);
	}

}
