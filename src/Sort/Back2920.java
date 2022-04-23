package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ���� ����
/*
 *  ������ ������ ���ǿ� ���� ����ϴ� ������ �ٸ���
 *  
 *  ascending �� mixed ¦
 *  desending�� mixed ¦ 
 *  mixed�� �׻� �����Ѵ�.
 *  
 *  �׷���
 *  ascending, desending�� �� ��� �������� ��� ������ ���ؼ� boolean���� �Ǻ��Ͽ� false �̸� mixed�� ������ڰ� ��������
 *  
 *  �׷��� ��� ������ ascending��������, desending �������� ���ؾ��Ѵ�.
 *  �׷��� ó�� 0��° ���ҿ� 1��° ��Ҹ� ���Ͽ� 
 *  0��° ��� > 1��° ��� ���� ũ�� desending���� �����ϰ�
 *  
 *  0��° ��� < 1��° ��Һ��� ũ��ascending���� �������ڶ�� �����ߴ�.
 *  
 *  
 * 
 * 
 * 
 * */
 

public class Back2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[8];
		for(int i = 0; i <8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(arr[0] < arr[1]) { //���� ���� ����
			 boolean flag =increasing(arr,Arrays.copyOfRange(arr, 1, arr.length));
			 if(flag) System.out.println("ascending");
			 else System.out.println("mixed");
		}else { // ���� ���� ����
			 boolean flag = descresing(arr,Arrays.copyOfRange(arr, 1,arr.length)) ;
			 if(flag) System.out.println("descending");
			 else System.out.println("mixed");
		}
		
	}
	// �Ǻ��Լ�

	private static boolean increasing(int[] arr, int[] array) {
		boolean flag = true;
		// flag = true; �̸� ��������
		for(int i = 0; i <array.length-1; i++) {//flag = flase �̸� ��������
			if(array[i] > array[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
		
		
		
	}

	private static boolean descresing(int[] arr, int[] array) {
		boolean flag = true;
		for(int i = 0; i<array.length-1; i++ ) {
			if(array[i] < array[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
		
	}

}
