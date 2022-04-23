package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ���
// �ð� ���⵵ O(n)
public class PirmeNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		int cnt = 0;
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
			boolean flag = Check(arr[i]);
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}

	private static boolean Check2(int num) {
		if(num < 2) return false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
	// 2�� ȿ�� ����
	private static boolean Check3(int num) {
		if(num < 2) return false;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
	
	// 3�� ȿ�� ����
		private static boolean Check(int num) {
			if(num < 2) return false;
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) return false;
			}
			
			return true;
		}
}
