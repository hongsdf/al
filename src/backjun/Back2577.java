package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class Back2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.*/
		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(InputStreamReader(System.in));
//		 
//		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value);
		
//		str.charAt(value) - '0' ���ڿ� ����
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = A * B* C;
		System.out.println(A * B * C);
		int mode[] = new int[10];
		while(sum > 0) {
//			int m  = sum%10;
			mode[sum%10]++;
			sum /= 10;
		}
//		for(int i = 0;i<mode.length; i++) {
//			System.out.println(mode[i]);
//		}
		for(int k: mode) {
			System.out.println(k);
		}
		
	}

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}
